package com.urise.webapp;

import com.urise.webapp.model.*;

import java.util.*;

public class ResumeTestData {

    private static Link phoneLink = new Link("+7(921) 855-0482)");
    private static Link skypeLink = new Link("skype:grigory.kislin", "skype:skype:grigory.kislin");
    private static Link mailLink = new Link("gkislin@yandex.ru", "mailto:gkislin@yandex.ru");
    private static Link linkedInLink = new Link(ContactType.LINKEDIN.getTitle(), "https://www.linkedin.com/in/gkislin");
    private static Link gitHubLink = new Link(ContactType.GITHUB.getTitle(), "https://github.com/gkislin");
    private static Link stackOverFlowLink = new Link(ContactType.STACKOVERFLOW.getTitle(), "https://stackoverflow.com/users/548473");
    private static Link homePageLink = new Link(ContactType.HOMEPAGE.getTitle(), "http://gkislin.ru/");
    private static String objectiveContent = "Ведущий стажировок и корпоративного обучения по Java Web и Enterprise технологиям";
    private static String personalContent = "Аналитический склад ума, сильная логика, креативность, инициативность. Пурист кода и архитектуры.";
    private static String achievementContent = "Организация команды и успешная реализация Java проектов для сторонних заказчиков: приложения автопарк на стеке Spring Cloud/микросервисы, система мониторинга показателей спортсменов на Spring Boot, участие в проекте МЭШ на Play-2, многомодульный Spring Boot + Vaadin проект для комплексных DIY смет. \n" +
            "С 2013 года: разработка проектов \"Разработка Web приложения\",\"Java Enterprise\", \"Многомодульный maven. Многопоточность. XML (JAXB/StAX). Веб сервисы (JAX-RS/SOAP). Удаленное взаимодействие (JMS/AKKA)\". Организация онлайн стажировок и ведение проектов. Более 3500 выпускников.\n" +
            "Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. Интеграция с Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.\n" +
            "Налаживание процесса разработки и непрерывной интеграции ERP системы River BPM. Интеграция с 1С, Bonita BPM, CMIS, LDAP. Разработка приложения управления окружением на стеке: Scala/Play/Anorm/JQuery. Разработка SSO аутентификации и авторизации различных ERP модулей, интеграция CIFS/SMB java сервера.\n" +
            "Реализация c нуля Rich Internet Application приложения на стеке технологий JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Commet, HTML5, Highstock для алгоритмического трейдинга.\n" +
            "Создание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов (SOA-base архитектура, JAX-WS, JMS, AS Glassfish). Сбор статистики сервисов и информации о состоянии через систему мониторинга Nagios. Реализация онлайн клиента для администрирования и мониторинга системы по JMX (Jython/ Django).\n" +
            "Реализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, Chronopay, Сбербанк), Белоруcсии(Erip, Osmp) и Никарагуа.";
    private static String qualificationsContent = "JEE AS: GlassFish (v2.1, v3), OC4J, JBoss, Tomcat, Jetty, WebLogic, WSO2\n" +
            "Version control: Subversion, Git, Mercury, ClearCase, Perforce\n" +
            "DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis), H2, Oracle, MySQL, SQLite, MS SQL, HSQLDB\n" +
            "Languages: Java, Scala, Python/Jython/PL-Python, JavaScript, Groovy\n" +
            "XML/XSD/XSLT, SQL, C/C++, Unix shell scripts\n" +
            "Java Frameworks: Java 8 (Time API, Streams), Guava, Java Executor, MyBatis, Spring (MVC, Security, Data, Clouds, Boot), JPA (Hibernate, EclipseLink), Guice, GWT(SmartGWT, ExtGWT/GXT), Vaadin, Jasperreports, Apache Commons, Eclipse SWT, JUnit, Selenium (htmlelements).\n" +
            "Python: Django.\n" +
            "JavaScript: jQuery, ExtJS, Bootstrap.js, underscore.js\n" +
            "Scala: SBT, Play2, Specs2, Anorm, Spray, Akka\n" +
            "Технологии: Servlet, JSP/JSTL, JAX-WS, REST, EJB, RMI, JMS, JavaMail, JAXB, StAX, SAX, DOM, XSLT, MDB, JMX, JDBC, JPA, JNDI, JAAS, SOAP, AJAX, Commet, HTML5, ESB, CMIS, BPMN2, LDAP, OAuth1, OAuth2, JWT.\n" +
            "Инструменты: Maven + plugin development, Gradle, настройка Ngnix\n" +
            "администрирование Hudson/Jenkins, Ant + custom task, SoapUI, JPublisher, Flyway, Nagios, iReport, OpenCmis, Bonita, pgBouncer\n" +
            "Отличное знание и опыт применения концепций ООП, SOA, шаблонов проектрирования, архитектурных шаблонов, UML, функционального программирования\n" +
            "Родной русский, английский \"upper intermediate\"";
    private static String experienceContent = "Java Online Projects\n" +
            "http://javaops.ru/\n" +
            "10/2013 - Сейчас\n" +
            "Автор проекта.\n" +
            "Создание, организация и проведение Java онлайн проектов и стажировок.\n" +
            "Wrike\n" +
            "https://www.wrike.com/\n" +
            "10/2014 - 01/2016\n" +
            "Старший разработчик (backend)\n" +
            "Проектирование и разработка онлайн платформы управления проектами Wrike (Java 8 API, Maven, Spring, MyBatis, Guava, Vaadin, PostgreSQL, Redis). Двухфакторная аутентификация, авторизация по OAuth1, OAuth2, JWT SSO.\n" +
            "RIT Center\n" +
            "\n" +
            "04/2012 - 10/2014\n" +
            "Java архитектор\n" +
            "Организация процесса разработки системы ERP для разных окружений: релизная политика, версионирование, ведение CI (Jenkins), миграция базы (кастомизация Flyway), конфигурирование системы (pgBoucer, Nginx), AAA via SSO. Архитектура БД и серверной части системы. Разработка интергационных сервисов: CMIS, BPMN2, 1C (WebServices), сервисов общего назначения (почта, экспорт в pdf, doc, html). Интеграция Alfresco JLAN для online редактирование из браузера документов MS Office. Maven + plugin development, Ant, Apache Commons, Spring security, Spring MVC, Tomcat,WSO2, xcmis, OpenCmis, Bonita, Python scripting, Unix shell remote scripting via ssh tunnels, PL/Python\n" +
            "Luxoft (Deutsche Bank)\n" +
            "http://www.luxoft.ru/\n" +
            "12/2010 - 04/2012\n" +
            "Ведущий программист\n" +
            "Участие в проекте Deutsche Bank CRM (WebLogic, Hibernate, Spring, Spring MVC, SmartGWT, GWT, Jasper, Oracle). Реализация клиентской и серверной части CRM. Реализация RIA-приложения для администрирования, мониторинга и анализа результатов в области алгоритмического трейдинга. JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Highstock, Commet, HTML5.\n" +
            "Yota\n" +
            "https://www.yota.ru/\n" +
            "06/2008 - 12/2010\n" +
            "Ведущий специалист\n" +
            "Дизайн и имплементация Java EE фреймворка для отдела \"Платежные Системы\" (GlassFish v2.1, v3, OC4J, EJB3, JAX-WS RI 2.1, Servlet 2.4, JSP, JMX, JMS, Maven2). Реализация администрирования, статистики и мониторинга фреймворка. Разработка online JMX клиента (Python/ Jython, Django, ExtJS)\n" +
            "Enkata\n" +
            "http://enkata.com/\n" +
            "03/2007 - 06/2008\n" +
            "Разработчик ПО\n" +
            "Реализация клиентской (Eclipse RCP) и серверной (JBoss 4.2, Hibernate 3.0, Tomcat, JMS) частей кластерного J2EE приложения (OLAP, Data mining).\n" +
            "Siemens AG\n" +
            "https://www.siemens.com/ru/ru/home.html\n" +
            "01/2005 - 02/2007\n" +
            "Разработчик ПО\n" +
            "Разработка информационной модели, проектирование интерфейсов, реализация и отладка ПО на мобильной IN платформе Siemens @vantage (Java, Unix).\n" +
            "Alcatel\n" +
            "http://www.alcatel.ru/\n" +
            "09/1997 - 01/2005\n" +
            "Инженер по аппаратному и программному тестированию\n" +
            "Тестирование, отладка, внедрение ПО цифровой телефонной станции Alcatel 1000 S12 (CHILL, ASM).";
    private static String educationContent = "Coursera\n" +
            "https://www.coursera.org/course/progfun\n" +
            "03/2013 - 05/2013\n" +
            "'Functional Programming Principles in Scala' by Martin Odersky\n" +
            "Luxoft\n" +
            "http://www.luxoft-training.ru/training/catalog/course.html?ID=22366\n" +
            "03/2011 - 04/2011\n" +
            "Курс 'Объектно-ориентированный анализ ИС. Концептуальное моделирование на UML.'\n" +
            "Siemens AG\n" +
            "http://www.siemens.ru/\n" +
            "01/2005 - 04/2005\n" +
            "3 месяца обучения мобильным IN сетям (Берлин)\n" +
            "Alcatel\n" +
            "http://www.alcatel.ru/\n" +
            "09/1997 - 03/1998\n" +
            "6 месяцев обучения цифровым телефонным сетям (Москва)\n" +
            "Санкт-Петербургский национальный исследовательский университет информационных технологий, механики и оптики\n" +
            "http://www.ifmo.ru/\n" +
            "09/1993 - 07/1996\n" +
            "Аспирантура (программист С, С++)\n" +
            "Санкт-Петербургский национальный исследовательский университет информационных технологий, механики и оптики\n" +
            "http://www.ifmo.ru/\n" +
            "09/1987 - 07/1993\n" +
            "Инженер (программист Fortran, C)\n" +
            "Заочная физико-техническая школа при МФТИ\n" +
            "https://mipt.ru/\n" +
            "09/1984 - 06/1987\n" +
            "Закончил с отличием";


    public static void main(String[] args) throws Exception {
        Resume resume = new Resume("testResume");
        resume.contacts.put(ContactType.PHONE, phoneLink);
        resume.contacts.put(ContactType.SKYPE, skypeLink);
        resume.contacts.put(ContactType.MAIL, mailLink);
        resume.contacts.put(ContactType.LINKEDIN, linkedInLink);
        resume.contacts.put(ContactType.GITHUB, gitHubLink);
        resume.contacts.put(ContactType.STACKOVERFLOW, stackOverFlowLink);
        resume.contacts.put(ContactType.HOMEPAGE, homePageLink);

        resume.sections.put(SectionType.OBJECTIVE, new TextSection(objectiveContent));
        resume.sections.put(SectionType.PERSONAL, new TextSection(personalContent));
        resume.sections.put(SectionType.ACHIEVEMENT, fillListSection(achievementContent));
        resume.sections.put(SectionType.QUALIFICATIONS, fillListSection(qualificationsContent));
        resume.sections.put(SectionType.EXPERIENCE, fillOrganizationSection(experienceContent, SectionType.EXPERIENCE));
        resume.sections.put(SectionType.EDUCATION, fillOrganizationSection(educationContent, SectionType.EDUCATION));
        System.out.println(resume);
    }

    private static Section fillListSection(String text) {
        return new ListSection(new ArrayList<>(Arrays.asList(text.split("\n"))));
    }

    private static CompanySection fillOrganizationSection(String text, SectionType type) throws Exception {
        String[] lines = text.split("\n| - ");
        int counter = (type == SectionType.EXPERIENCE) ? 6 : 5;
        List<Company> companies = new ArrayList<>();
        for (int i = 0; i < lines.length; i += counter) {
            String[] args = Arrays.copyOfRange(lines, i, i + counter);
            Company buffCompany = new Company(args);
            if (companies.contains(buffCompany)) {
                args = Arrays.copyOfRange(args, 2, args.length);
                companies.get(companies.indexOf(buffCompany)).addPeriods(args);
            } else {
                companies.add(buffCompany);
            }
        }
        return new CompanySection(companies);
    }
}
