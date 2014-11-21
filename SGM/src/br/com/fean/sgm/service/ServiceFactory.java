package br.com.fean.sgm.service;

import br.com.fean.sgm.service.impl.TurmaService;


public class ServiceFactory {

    private static final ITurmaService turmaService = new TurmaService();

    public static ITurmaService getTurmaService() {
        return turmaService;
    }
}
