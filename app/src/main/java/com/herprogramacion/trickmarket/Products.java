package com.herprogramacion.trickmarket;

/**
 * Datos de prueba para las pestañas
 */
public class Products {

    private static Product[] eventos = {

            new Product(
                "Chiautla",
                " Fiesta en honor a la Purisima Concepción",
                "7-12 de Diciembre",
                    "9:00-22:00",
                3.1f,
            R.drawable.chiautla)
            ,new Product(
                "Amozoc",
                "Fiesta de la Virgen de Guadalupe",
                "12 de diciembre",
            "9:00-23:00",
                4.0f,
            R.drawable.amozoc),
            new Product(
                    "San Andres Calpan",
                    "Tradicional feria",
                    "30 de Noviembre",
                    "9:00-23:00",
                    4.6f,
                    R.drawable.calpan),
            new Product(
                    "Parque Bicentenario",
                    " Espectaculo Circence",
                    "2 de Diciembre",
                    "15:00",
                    3.0f,
                    R.drawable.rodara),
            new Product(
                    "Centro de Convenciones",
                    "Expo Liquidación Navideña",
                    "2-5 de Diciembre",
                    "9:00-17:00",
                    4.6f,
                    R.drawable.expo)/*,

            new Product(
                    "Wiko Rainbow",
                    " 4Gb ROM, 1GB RAM, Camara 8Mpx.",
                    "$169 USD",
                    4.1f,
                    R.drawable.smartphone_wiko_rainbow),


            new Product(
                    "Hisense HS-U980",
                    " 8Gb ROM, 1GB RAM, Camara 8Mpx.",
                    "$203.9 USD",
                    2.8f,
                    R.drawable.smartphone_hisense_hs_u980)*/

    };

    private static Product[] tablets = {
            new Product(
                    "Acajete",
                    "Zona Mizxteca",
                    "1hr 30 minutos",
                    "Ven y conoce",
                    5.0f,
                    R.drawable.acajete_iglesia),
            new Product(
                    "Atlixco",
                    "Zona Centro",
                    "1hr 30 minutos",
                    "Ven y conoce",
                    4.0f,
                    R.drawable.atlixco),
            new Product(
                    "Chignahuapan",
                    "Sierra Norte",
                    "3hr 10 minutos",
                    "Ven y conoce",
                    4.6f,
                    R.drawable.chignahuapan),
            new Product(
                    "San Andres Cholula",
                    "Zona Centro",
                    "1 hr",
                    "Ven y conoce",
                    3.0f,
                    R.drawable.cholula),
            new Product(
                    "Zacatlan",
                    "Sierra Norte",
                    "3hr 20 minutos",
                    "Ven y conoce",
                    3f,
                    R.drawable.zacatlan_reloj)/*,

            new Product(
                    "Nvidia Shield Tablet",
                    "Android 4.4 Kitkat",
                    "$375 USD",
                    4.8f,
                    R.drawable.tablet_nvidia_shield),


            new Product(
                    "ASUS Transformer Pad Infinity TF700",
                    "Android 4.2 Jelly Bean",
                    "$509 USD",
                    4f,
                    R.drawable.tablet_asus_transformer_pad_infinity_tf700)*/
    };

   /* private static Product[] portatiles = {
            new Product(
                    "Dell Latitude 12",
                    "Model No: 7204",
                    "$6474 USD",
                    5.0f,
                    R.drawable.portatil_latitude_12_rugged),
            new Product(
                    "Alienware 17 R1 Flagship",
                    "Gaming",
                    "$3849 USD",
                    4.0f,
                    R.drawable.portatil_alienware_17_flagship),
            new Product(
                    "MSI GT80 Titan SLI",
                    "Gaming",
                    "$3299 USD",
                    4.6f,
                    R.drawable.portatil_msi_gt80_titan),
            new Product(
                    "ASUS ROG G751YJ-DH72X",
                    "Gaming",
                    "$2999 USD",
                    3.0f,
                    R.drawable.portatil_asus_rog_g751jy),
            new Product(
                    "Toshiba X70-AST3G26",
                    "All-Purpose",
                    "$2699 USD",
                    3f,
                    R.drawable.portatil_toshiba_x70_ast3g26),

            new Product(
                    "Sony VAIO Duo 13",
                    "2-in-1",
                    "$2699 USD",
                    4.8f,
                    R.drawable.portatil_sony_vaio_duo_13_svd1322bpxb),


            new Product(
                    "Gigabyte Aorus X3 Plus v3",
                    "Gaming",
                    "$2538 USD",
                    4f,
                    R.drawable.portatil_gigabyte_aorus_x3_plus_v3)
    }; */

    public static Product[] getEventos() {
        return eventos;
    }


    public static Product[] getTablets() {
        return tablets;
    }

    //public static Product[] getPortatiles() {
       // return portatiles;
    //}
}
