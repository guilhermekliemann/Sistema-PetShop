package br.kliemann.sistemapetshop;

import br.kliemann.sistemapetshop.controller.Banho;
import br.kliemann.sistemapetshop.controller.Consulta;
import br.kliemann.sistemapetshop.controller.Tosa;
import br.kliemann.sistemapetshop.controller.Vacinacao;
import br.kliemann.sistemapetshop.model.Endereco;
import br.kliemann.sistemapetshop.enums.EspecieENUM;
import br.kliemann.sistemapetshop.model.MedicoVeterinario;
import br.kliemann.sistemapetshop.model.Proprietario;
import br.kliemann.sistemapetshop.enums.SexoAnimalENUM;
import br.kliemann.sistemapetshop.model.Cidade;
import br.kliemann.sistemapetshop.model.Estado;
import br.kliemann.sistemapetshop.model.Exame;
import br.kliemann.sistemapetshop.model.Medicamento;
import br.kliemann.sistemapetshop.model.Pais;
import br.kliemann.sistemapetshop.model.Pet;
import br.kliemann.sistemapetshop.model.Vacina;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        Pais brasil = new Pais(1, "Brasil");
        Estado parana = new Estado(1, "Paraná", brasil);
        Cidade toledo = new Cidade(1, "Toledo", parana);
        Endereco enderecoEduardo = new Endereco(1, "Rua Guaira", 634, "Jardim Pancera", toledo);
        Endereco enderecoGuilherme = new Endereco(2, "Rua General Alcides Etchegoyen", 972, "Jardim La Salle", toledo);
        
        System.out.println("------------------\nCADASTRO MEDICO VETERINARIO\n");
        MedicoVeterinario daniel = new MedicoVeterinario(1, "Daniel Gomes", "45678", "456", "45 99852-4265", enderecoEduardo);
        System.out.println(daniel.toString());
        
        System.out.println("------------------\nCADASTRO PROPRIETARIO E PET\n");
        Pet lessy = new Pet(1, "Lessy", EspecieENUM.CACHORRO, "Border collie", 5, "Preto e Branco", SexoAnimalENUM.FEMEA);
        Proprietario thomas = new Proprietario(1, lessy, "Thomas Figueiredo", "12345", "123", "45 99830-8768", enderecoGuilherme);
        System.out.println(thomas.toString());
        
        System.out.println("------------------\nCADASTRO VACINA, MEDICAMENTO E EXAME");
        Medicamento verme = new Medicamento(1, "Virbac", "Endogard", "Antiparasitário interno para cães - 2 comprimidos", 56);
        System.out.println(verme.toString());
        Exame exameSangue = new Exame(1, "Hemograma", 40);
        System.out.println(exameSangue.toString());
        Vacina raiva = new Vacina(1, "Lema-Injex", "Raiva i", "Vacina Antirábica - 1 dose", 20);
        System.out.println(raiva.toString());

        System.out.println("------------------\nCADASTRO VACINACAO\n");
        Vacinacao vacinacaoLessy = new Vacinacao(1, daniel, thomas, lessy, raiva, new Date(), "01/01/2023");
        System.out.println(vacinacaoLessy.toString());
        
        System.out.println("------------------\nCADASTRO BANHO E TOSA");
        Banho banhoLessy = new Banho(1, daniel, thomas, lessy, "20/09/2022");
        System.out.println(banhoLessy.toString());
        Tosa tosaLessy = new Tosa(1, daniel, thomas, lessy, "20/09/2022");
        System.out.println(tosaLessy.toString());
        
        System.out.println("------------------\nCADASTRO CONSULTA\n");
        Consulta consultaLessy = new Consulta(1, daniel, thomas, lessy, new Date(), verme, exameSangue);
        System.out.println(consultaLessy.toString());
        
    }
}