package com.devco.adidas.utils;

public class Ejecutar {

    public static void enCmd(String nombreRunner){
        try {
            String[] cmd = new String[3];

            cmd[0] = "cmd.exe";
            cmd[1] = "/C";
            cmd[2] = "gradle clean test --tests *" + nombreRunner + " aggregate";

            Runtime rt = Runtime.getRuntime();
            System.out.println("Executing " + cmd[0] + " " + cmd[1] + " " + cmd[2]);
            Process proc = rt.exec(cmd);

            com.devco.adidas.utils.StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR");

            com.devco.adidas.utils.StreamGobbler outputGobbler = new StreamGobbler(proc.getInputStream(), "OUTPUT");

            errorGobbler.start();
            outputGobbler.start();

            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);
        } catch (Throwable t) {
            t.printStackTrace();
        } }

}
