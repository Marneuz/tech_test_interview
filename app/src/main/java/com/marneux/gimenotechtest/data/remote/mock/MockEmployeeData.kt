package com.marneux.gimenotechtest.data.remote.mock

import com.marneux.gimenotechtest.R
import com.marneux.gimenotechtest.domain.model.Employee

object MockEmployeeData {
    fun getMockEmployees(): List<Employee> {
        return listOf(
            Employee(1, "Juan", "Perez", "Diseñador", "660646766", "juan.perez@example.com",
                imageResId = R.drawable.chico1),
            Employee(2, "Ana", "Garcia", "QA", "690764577", "ana.garcia@example.com",imageResId =
            R.drawable.chica1),
            Employee(3, "Luis", "Rodriguez", "Desarrollador", "666453223", "luis" +
                    ".rodriguez@example.com",imageResId = R.drawable.chico2),
            Employee(4, "Maria", "Lopez", "CEO", "669987654", "maria.lopez@example.com",
                imageResId = R.drawable.chica2),
            Employee(5, "Carlos", "Gomez", "Tecnico RRHH", "693245678", "carlos.gomez@example" +
                    ".com",imageResId = R.drawable.chico3),
            Employee(6, "Elena", "Martinez", "Diseñador", "661123456", "elena.martinez@example" +
                    ".com",imageResId = R.drawable.chica3),
            Employee(7, "Javier", "Hernandez", "QA", "692987654", "javier.hernandez@example.com"),
            Employee(8, "Laura", "Sanchez", "Desarrollador", "694567890", "laura.sanchez@example" +
                    ".com",imageResId = R.drawable.chica4),
            Employee(9, "Fernando", "Diaz", "CEO", "695678901", "fernando.diaz@example.com"),
            Employee(10, "Sara", "Fernandez", "Tecnico RRHH", "696789012", "sara" +
                    ".fernandez@example.com",imageResId = R.drawable.chica4),
            Employee(11, "David", "Ruiz", "Diseñador", "697890123", "david.ruiz@example.com",
                imageResId = R.drawable.chico4),
            Employee(12, "Marta", "Moreno", "QA", "698901234", "marta.moreno@example.com",
                imageResId = R.drawable.chica1),
            Employee(13, "Pablo", "Alvarez", "Desarrollador", "699012345", "pablo.alvarez@example" +
                    ".com",imageResId = R.drawable.chico3),
            Employee(14, "Sofia", "Gonzalez", "CEO", "600123456", "sofia.gonzalez@example.com",
                imageResId = R.drawable.chica3),
            Employee(15, "Ruben", "Gutierrez", "Tecnico RRHH", "601234567", "ruben" +
                    ".gutierrez@example.com",imageResId = R.drawable.chico4),
            Employee(16, "Cristina", "Santos", "Diseñador", "602345678", "cristina.santos@example" +
                    ".com",imageResId = R.drawable.chica2),
            Employee(17, "Oscar", "Castro", "QA", "603456789", "oscar.castro@example.com",
                imageResId = R.drawable.chico3),
            Employee(18, "Claudia", "Vega", "Desarrollador", "604567890", "claudia.vega@example" +
                    ".com",imageResId = R.drawable.chica1),
            Employee(19, "Andres", "Cabrera", "CEO", "605678901", "andres.cabrera@example.com",imageResId = R.drawable.chico1),
            Employee(20, "Natalia", "Blanco", "Tecnico RRHH", "606789012", "natalia.blanco@example.com"),
            Employee(21, "Victor", "Mendez", "Diseñador", "607890123", "victor.mendez@example.com"),
            Employee(22, "Isabel", "Cruz", "QA", "608901234", "isabel.cruz@example.com"),
            Employee(23, "Diego", "Ortega", "Desarrollador", "609012345", "diego.ortega@example.com"),
            Employee(24, "Patricia", "Ramirez", "CEO", "610123456", "patricia.ramirez@example.com"),
            Employee(25, "Alberto", "Navarro", "Tecnico RRHH", "611234567", "alberto.navarro@example.com"),
            Employee(26, "Raquel", "Reyes", "Diseñador", "612345678", "raquel.reyes@example.com"),
            Employee(27, "Sergio", "Jimenez", "QA", "613456789", "sergio.jimenez@example.com"),
            Employee(28, "Lorena", "Molina", "Desarrollador", "614567890", "lorena.molina@example.com"),
            Employee(29, "Ricardo", "Ramos", "CEO", "615678901", "ricardo.ramos@example.com"),
            Employee(30, "Silvia", "Serrano", "Tecnico RRHH", "616789012", "silvia.serrano@example.com"),
            Employee(31, "Manuel", "Iglesias", "Diseñador", "617890123", "manuel.iglesias@example.com"),
            Employee(32, "Teresa", "Soto", "QA", "618901234", "teresa.soto@example.com"),
            Employee(33, "Marcos", "Marquez", "Desarrollador", "619012345", "marcos.marquez@example.com"),
            Employee(34, "Paula", "Herrera", "CEO", "620123456", "paula.herrera@example.com"),
            Employee(35, "Adrian", "Medina", "Tecnico RRHH", "621234567", "adrian.medina@example.com"),
            Employee(36, "Beatriz", "Gil", "Diseñador", "622345678", "beatriz.gil@example.com"),
            Employee(37, "Felipe", "Leon", "QA", "623456789", "felipe.leon@example.com"),
            Employee(38, "Olga", "Pena", "Desarrollador", "624567890", "olga.pena@example.com"),
            Employee(39, "Guillermo", "Marti", "CEO", "625678901", "guillermo.marti@example.com"),
            Employee(40, "Eva", "Nieto", "Tecnico RRHH", "626789012", "eva.nieto@example.com"),
            Employee(41, "Miguel", "Rojas", "Diseñador", "627890123", "miguel.rojas@example.com"),
            Employee(42, "Alicia", "Cortes", "QA", "628901234", "alicia.cortes@example.com"),
            Employee(43, "Hugo", "Palacios", "Desarrollador", "629012345", "hugo.palacios@example.com"),
            Employee(44, "Carmen", "Herrero", "CEO", "630123456", "carmen.herrero@example.com"),
            Employee(45, "Alfonso", "Luque", "Tecnico RRHH", "631234567", "alfonso.luque@example.com"),
            Employee(46, "Andrea", "Cano", "Diseñador", "632345678", "andrea.cano@example.com"),
            Employee(47, "Gabriel", "Dominguez", "QA", "633456789", "gabriel.dominguez@example.com"),
            Employee(48, "Victoria", "Campos", "Desarrollador", "634567890", "victoria.campos@example.com"),
            Employee(49, "Raul", "Santana", "CEO", "635678901", "raul.santana@example.com"),
            Employee(50, "Lucia", "Benitez", "Tecnico RRHH", "636789012", "lucia.benitez@example.com"),
            Employee(51, "Enrique", "Sanz", "Diseñador", "637890123", "enrique.sanz@example.com"),
            Employee(52, "Celia", "Fuentes", "QA", "638901234", "celia.fuentes@example.com"),
            Employee(53, "Ignacio", "Lozano", "Desarrollador", "639012345", "ignacio.lozano@example.com"),
            Employee(54, "Rosa", "Suarez", "CEO", "640123456", "rosa.suarez@example.com"),
            Employee(55, "Pedro", "Ibanez", "Tecnico RRHH", "641234567", "pedro.ibanez@example.com"),
            Employee(56, "Julia", "Diez", "Diseñador", "642345678", "julia.diez@example.com"),
            Employee(57, "Marina", "Carrasco", "QA", "643456789", "marina.carrasco@example.com"),
            Employee(58, "Tomas", "Cordero", "Desarrollador", "644567890", "tomas.cordero@example.com"),
            Employee(59, "Angela", "Escudero", "CEO", "645678901", "angela.escudero@example.com"),
            Employee(60, "Jesus", "Reina", "Tecnico RRHH", "646789012", "jesus.reina@example.com"),
            Employee(61, "Monica", "Rivero", "Diseñador", "647890123", "monica.rivero@example.com"),
            Employee(62, "Emilio", "Villar", "QA", "648901234", "emilio.villar@example.com"),
            Employee(63, "Yolanda", "Beltran", "Desarrollador", "649012345", "yolanda.beltran@example.com"),
            Employee(64, "Alba", "Acosta", "CEO", "650123456", "alba.acosta@example.com"),
            Employee(65, "Martin", "Parra", "Tecnico RRHH", "651234567", "martin.parra@example.com"),
            Employee(66, "Gloria", "Salas", "Diseñador", "652345678", "gloria.salas@example.com"),
            Employee(67, "Eduardo", "Moya", "QA", "653456789", "eduardo.moya@example.com"),
            Employee(68, "Clara", "Esteban", "Desarrollador", "654567890", "clara.esteban@example.com"),
            Employee(69, "Francisco", "Rivas", "CEO", "655678901", "francisco.rivas@example.com"),
            Employee(70, "Lidia", "Sole", "Tecnico RRHH", "656789012", "lidia.sole@example.com"),
            Employee(71, "Alfredo", "Aranda", "Diseñador", "657890123", "alfredo.aranda@example.com"),
            Employee(72, "Natalio", "Lara", "QA", "658901234", "natalio.lara@example.com"),
            Employee(73, "Angela", "Casado", "Desarrollador", "659012345", "angela.casado@example.com"),
            Employee(74, "Jose", "Valle", "CEO", "660123456", "jose.valle@example.com"),
            Employee(75, "Ana", "Gallego", "Tecnico RRHH", "661234567", "ana.gallego@example.com"),
            Employee(76, "Luis", "Bueno", "Diseñador", "662345678", "luis.bueno@example.com"),
            Employee(77, "Maria", "Paredes", "QA", "663456789", "maria.paredes@example.com"),
            Employee(78, "Carlos", "Solano", "Desarrollador", "664567890", "carlos.solano@example.com"),
            Employee(79, "Elena", "Lopez", "CEO", "665678901", "elena.lopez@example.com"),
            Employee(80, "Javier", "Gutierrez", "Tecnico RRHH", "666789012", "javier.gutierrez@example.com"),
            Employee(81, "Laura", "Ortega", "Diseñador", "667890123", "laura.ortega@example.com"),
            Employee(82, "Fernando", "Ramirez", "QA", "668901234", "fernando.ramirez@example.com"),
            Employee(83, "Sara", "Navarro", "Desarrollador", "669012345", "sara.navarro@example.com"),
            Employee(84, "David", "Reyes", "CEO", "670123456", "david.reyes@example.com"),
            Employee(85, "Marta", "Jimenez", "Tecnico RRHH", "671234567", "marta.jimenez@example.com"),
            Employee(86, "Pablo", "Molina", "Diseñador", "672345678", "pablo.molina@example.com"),
            Employee(87, "Sofia", "Ramos", "QA", "673456789", "sofia.ramos@example.com"),
            Employee(88, "Ruben", "Serrano", "Desarrollador", "674567890", "ruben.serrano@example.com"),
            Employee(89, "Cristina", "Iglesias", "CEO", "675678901", "cristina.iglesias@example.com"),
            Employee(90, "Oscar", "Soto", "Tecnico RRHH", "676789012", "oscar.soto@example.com"),
            Employee(91, "Claudia", "Marquez", "Diseñador", "677890123", "claudia.marquez@example.com"),
            Employee(92, "Andres", "Herrera", "QA", "678901234", "andres.herrera@example.com"),
            Employee(93, "Natalia", "Medina", "Desarrollador", "679012345", "natalia.medina@example.com"),
            Employee(94, "Victor", "Gil", "CEO", "680123456", "victor.gil@example.com"),
            Employee(95, "Isabel", "Leon", "Tecnico RRHH", "681234567", "isabel.leon@example.com"),
            Employee(96, "Diego", "Pena", "Diseñador", "682345678", "diego.pena@example.com"),
            Employee(97, "Patricia", "Marti", "QA", "683456789", "patricia.marti@example.com"),
            Employee(98, "Alberto", "Nieto", "Desarrollador", "684567890", "alberto.nieto@example.com"),
            Employee(99, "Raquel", "Rojas", "CEO", "685678901", "raquel.rojas@example.com"),
            Employee(100, "Sergio", "Cortes", "Tecnico RRHH", "686789012", "sergio.cortes@example.com")
        )
    }
}