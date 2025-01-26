package br.com.linketinder.model

class Dados {
    List<Candidato> candidatos = []
    List<Empresa> empresas = []

    void inicializarDados() {
        candidatos.addAll([
                new Candidato("João", "joao@email.com", "12345678910", 20, "SP", "01001-000", "Desenvolvedor", ["Python", "Java"]),
                new Candidato("Maria", "maria@email.com", "98765432100", 19, "SE", "20001-000", "Analista de Sistemas", ["Angular", "Spring Framework"]),
                new Candidato("Carlos", "carlos@email.com", "45678912301", 30, "RN", "30001-000", "Engenheiro de Software", ["Node.js", "React"]),
                new Candidato("Ana", "ana@email.com", "32165498702", 50, "PB", "80001-000", "Desenvolvedora Mobile", ["Flutter", "Kotlin"]),
                new Candidato("Pedro", "pedro@email.com", "65412398703", 40, "PE", "40001-000", "DevOps", ["AWS", "Docker"])
        ])

        empresas.addAll([
                new Empresa("ZG", "contact@ZG.com", "12345678000199", "Brasil", "SP", "01002-000", "Empresa de tecnologia", ["Java", "Angular"]),
                new Empresa("ZeroGlosa", "contato@ZeroGlosa.com", "98765432000188", "Brasil", "RJ", "20002-000", "Fábrica de software", ["Python", "Node.js"]),
                new Empresa("MetaTech", "contato@MetaTech.com", "45678912000177", "Brasil", "MG", "30002-000", "Start-up de IA", ["Machine Learning", "Python"]),
                new Empresa("DataCorp", "contato@datacorp.com", "32165498000166", "Brasil", "PR", "80002-000", "Empresa Big Data", ["AWS", "Kubernetes"]),
                new Empresa("MobileTech", "contato@mobiletech.com", "65412397000155", "Brasil", "BA", "40002-000", "Desenvolvimento mobile", ["Flutter", "Kotlin"])
        ])
    }
}
