package com.seoeka.kamaikomiu.data

object LocationData {
    fun getLocationData(): List<Location>{
        val locationData = arrayListOf<Location>()
        val dummyLoc1 = Location(
            "Taman Nasional Lore Lindu",
            "Kabupaten Poso, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczP1i6TUCk2hzyfFKWklJBNVtbP4F4EyOmcZHemJH8YnYCEszA43jGU98nuR7TkDeCwifoFalYFGSX0HaXvSdbUK4VlMKR9Cj_CTNJati_bnSSwi4GOhvHjlNq36mEF_iufr1bXs3IR1qsViSsL0RYaW=w680-h435-s-no-gm?authuser=0",
            "Buka 24 jam, Setiap hari",
            "4.4 / 5.0",
            "https://maps.app.goo.gl/SE9YyCMGTj1KmA3X7",
            "Taman Nasional Lore Lindu (TNLL) terletak di provinsi Sulawesi Tengah, Indonesia, dan merupakan salah satu dari beberapa tujuan ekowisata terbaik di negara ini. Dengan jarak sekitar 60 km ke selatan Kota Palu, TNLL menawarkan pengalaman alam yang luar biasa dan beragam bagi para pengunjungnya.\n\n" +
                    "Wilayah TNLL merupakan habitat alami dari berbagai spesies langka dan dilindungi, menjadikannya tempat yang sangat penting untuk konservasi keanekaragaman hayati. TNLL terkenal karena keberadaan 77 burung endemik Sulawesi, termasuk beberapa spesies langka yang sulit ditemukan di tempat lain. \n\n" +
                    "Selain kekayaan hayati yang luar biasa, TNLL juga memiliki pemandangan alam yang memukau, termasuk gunung, danau, dan hutan hujan yang lebat. Para pengunjung dapat menikmati trekking melalui hutan yang rimbun, menjelajahi danau-danau yang indah, atau sekadar bersantai sambil menikmati keindahan alam sekitar.\n\n" +
                    "TNLL juga memiliki nilai sejarah dan budaya yang penting, dengan beberapa situs arkeologi prasejarah dan artefak budaya yang tersebar di seluruh taman nasional. Ini memberikan kesempatan bagi para pengunjung untuk belajar lebih banyak tentang sejarah dan kebudayaan Sulawesi Tengah sambil menikmati keindahan alamnya.\n\n" +
                    "Dengan upaya konservasi yang terus-menerus dan dukungan dari berbagai pihak, TNLL terus menjadi surga bagi kehidupan liar dan tempat rekreasi yang menarik bagi wisatawan dari seluruh dunia. Pengalaman di TNLL tidak hanya mempesona secara visual tetapi juga memberikan pemahaman yang mendalam tentang pentingnya menjaga dan melestarikan lingkungan alam untuk generasi mendatang."
        )

        val dummyLoc2 = Location(
            "Taman Nasional Kepulauan Togean",
            "Kabupaten Tojo Una-una, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczMwqdl5Qq_R0D3fR5sFITas3eAlvobS94WNReOGxLLxitAm-pU3P1yUAmmADMhQ2JvLAmua3_Tv6Sq9FQC4V3Yn-fgP-STp04-ZlevxhBiR9h30YZFXdCI-ovdLBxK2d4-msziO_P9gjkuqalLgh7wb=w1080-h383-s-no-gm?authuser=0",
            "Buka 24 jam, Setiap hari",
            "4.6 / 5.0",
            "https://maps.app.goo.gl/mSajq9swWXrNZ2o1A",
            "Kepulauan Togean terletak di Kabupaten Tojo Una-Una, Sulawesi Tengah, Indonesia, dan merupakan destinasi pariwisata yang sangat populer di wilayah tersebut. Dikenal karena keindahan alamnya yang menakjubkan, Kepulauan Togean menawarkan pengalaman liburan yang tak terlupakan bagi para pengunjungnya.\n\n" +
                    "Pemandangan pantai yang memesona dan laut yang jernih serta berwarna-warni adalah daya tarik utama Kepulauan Togean. Di sepanjang garis pantainya, pengunjung dapat menikmati pasir putih yang halus dan air laut yang tenang, menciptakan suasana yang sangat menenangkan dan menyegarkan.\n\n" +
                    "Selain kecantikan pantainya, Kepulauan Togean juga terkenal karena formasi batu karang yang menjulang di sepanjang pantai. Batu karang ini tidak hanya menambah keindahan alamnya tetapi juga menjadi tempat bersarangnya berbagai jenis kehidupan laut, sehingga menjadi surga bagi para penyelam dan penggemar snorkeling.\n\n" +
                    "Para pengunjung dapat mengeksplorasi kekayaan bawah laut Kepulauan Togean yang menakjubkan, menyaksikan terumbu karang yang indah dan beragam spesies ikan yang berenang di sekitarnya. Aktivitas menyelam dan snorkeling di sini akan memberikan pengalaman yang luar biasa dan tak terlupakan bagi siapa pun yang mencintai kehidupan bawah laut.\n\n" +
                    "Selain itu, Kepulauan Togean juga menawarkan berbagai kegiatan lain bagi para pengunjungnya, seperti berkeliling pulau, memancing, dan menikmati wisata kuliner dengan mencicipi makanan laut segar dan lezat. Dengan keramahan penduduk setempat dan keindahan alamnya yang memukau, Kepulauan Togean adalah destinasi liburan yang sempurna bagi siapa pun yang mencari ketenangan dan keindahan alam yang tiada tara."
        )

        val dummyLoc3 = Location(
            "Gedung Juang",
            "Kota Palu, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczPdvRJPH8eaf8r0zl2sUjQ1fvqF6IfBcXacsXJ9OEwoUB-O-0Zv5-ZSe2vFeG5oV47KmO1SdJxYmSwa4kgqlVsWC3E47e-iMsVLuQtPYMzi2_fE0JK1P_q6zuv0O5xOgRLsIE1paN1PIoNI6qe8LL12=w1093-h515-s-no-gm?authuser=0",
            "08.00-17.00 WITA, Tutup akhir pekan",
            "4.4 / 5.0",
            "https://maps.app.goo.gl/rbnchtzDnzNtFAp49",
            "Gedung Juang di Tanah Kaili, Sulawesi Tengah, menjadi saksi bisu perjalanan sejarah Indonesia yang penuh makna. Bangunan ini bukan hanya sekadar sebuah gedung, tetapi juga merupakan simbol dari perjuangan bangsa Indonesia dalam merebut kemerdekaannya dari penjajahan Belanda.\n\n" +
                    "Dalam dinding-dindingnya, terpahat cerita tentang masa lalu yang menyedihkan namun juga membanggakan. Gedung Juang adalah tempat di mana pemerintahan kolonial Belanda berkantor, memutuskan takdir, dan merencanakan masa depan Sulawesi Tengah sesuai dengan kepentingan mereka sendiri.\n\n" +
                    "Namun, di balik tirani penjajahan tersebut, terdapat semangat juang yang berkobar-kobar di kalangan rakyat. Di sini, para pejuang kemerdekaan bersatu, merundingkan strategi, dan mengambil langkah-langkah berani untuk mengakhiri penjajahan dan mendapatkan kemerdekaan bagi tanah air tercinta.\n\n" +
                    "Dengan perjuangan dan pengorbanan yang besar, akhirnya, pada suatu hari yang bersejarah, gedung ini menjadi saksi ketika kemerdekaan Indonesia secara resmi dinyatakan. Di sinilah para pemimpin bangsa menandatangani pernyataan kemerdekaan, mengakhiri era penjajahan dan membuka babak baru dalam sejarah Indonesia yang merdeka dan berdaulat.\n\n" +
                    "Hingga kini, Gedung Juang tetap berdiri teguh sebagai penjaga sejarah dan warisan berharga bagi generasi masa kini dan mendatang. Bangunan ini mengingatkan kita akan perjuangan yang telah dilakukan oleh para pahlawan kita, dan menjadi simbol kebanggaan bagi seluruh bangsa Indonesia."
        )

        val dummyLoc4 = Location(
            "Pusat Laut",
            "Kabupaten Donggala, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczOnK0H1nZAYFrSGBoaMua3M333Mv2hwznVNHtC-SGD17T5yvcSbUrYEmeA2DEseWBqvgBGTsCuF4uWSzBhZ-XUkGozzdlzwOoH7mblx9wQpTw6_i9HjfjGrmO1DNkFXbjIX3tkVj7jLiRRZbZlUxrDz=w700-h525-s-no-gm?authuser=0",
            "07.00-18.00 WITA, Setiap hari",
            "4.4 / 5.0",
            "https://maps.app.goo.gl/BBwZ1AYRQY6RdVhV9",
            "Nama ‘Pusentasi’ atau Pusat Laut yang dikenal oleh masyarakat sekitar, berasal dari bahasa suku Kaili, suku terbesar yang menghuni Provinsi Sulawesi Tengah. Kata 'Pusen' berasal dari bahasa Kaili yang berarti 'Pusat', sedangkan kata 'Tasi' memiliki arti 'Laut'. Menurut cerita yang turun-temurun, Pusat Laut ini adalah sebuah fenomena alam yang unik, terbentuk akibat ambrolnya tanah secara tiba-tiba ke dalam tanah yang membentuk suatu cekungan yang kebetulan berbentuk melingkar, mirip dengan sebuah sumur.\n\n" +
                    "Fenomena alam ini telah menjadi bagian dari mitos dan legenda dalam budaya lokal, memberikan warna tersendiri dalam sejarah dan kehidupan masyarakat sekitar. Alasan di balik runtuhnya permukaan tanah yang menyebabkan air muncul di tempat tersebut adalah karena letaknya yang sangat berdekatan dengan bibir pantai, menciptakan hubungan yang erat antara daratan dan lautan.\n\n" +
                    "Pusentasi menjadi sebuah destinasi yang menarik bagi para wisatawan dan peneliti alam, menawarkan pemandangan yang memukau dan cerita yang memikat. Keberadaannya juga menjadi salah satu contoh keajaiban alam yang patut dijaga dan dilestarikan untuk generasi mendatang."
        )

        val dummyLoc5 = Location(
            "Danau Paisupok",
            "Kabupaten Banggai Kepulauan, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczMzArno-jqUzhigy62aQapDQXil70fLjsfsdmYthFo3WzJ-JAg_LW8tmcCTBs5QBJ5RBqdvsYrpzKaCipF7X4NdUH81fINIq7gnTYZ8d0AN2h-vkWZiuyJPoolObmNcOS44mHZhFIdraGrBaAh_csh9=w668-h464-s-no-gm?authuser=0",
            "Buka 24 Jam, Setiap Hari",
            "4.8 / 5.0",
            "https://maps.app.goo.gl/zQHjXUZhJngTCsNB9",
            "Danau Paisupok adalah salah satu keajaiban alam yang tersembunyi di Desa Luk Panenteng, Bulagi Utara, Kabupaten Banggai Kepulauan, Sulawesi Tengah. Keindahan danau ini tidak hanya terletak pada airnya yang jernih dan menawan, tetapi juga pada lingkungannya yang alami dan asri.\n\n" +
                    "Berada di sekitar Danau Paisupok, terhampar hutan yang masih lestari dan belum tersentuh, menjadi rumah bagi berbagai jenis flora dan fauna endemik, termasuk hewan langka seperti Gagak Peling dan Tarsius, yang hanya bisa ditemukan di wilayah Kabupaten Banggai Kepulauan. Hutan ini menjadi penting dalam menjaga keberagaman hayati dan ekosistem di daerah tersebut.\n\n" +
                    "Tidak hanya sebagai tempat wisata alam, sekitar Danau Paisupok juga terdapat permukiman Desa Luk Panenteng. Desa ini kaya akan budaya suku Sea-sea, suku asli dari wilayah Banggai, yang memberikan warna dan kekayaan tersendiri bagi kehidupan masyarakat lokal.\n\n" +
                    "Danau Paisupok menjadi destinasi yang menarik bagi para pengunjung yang mencari ketenangan dan keindahan alam yang autentik. Keberadaannya juga memberikan kesempatan bagi para peneliti dan pecinta alam untuk menjelajahi serta mempelajari kehidupan liar yang ada di sekitarnya."
        )

        val dummyLoc6 = Location(
            "Air Terjun Saluopa",
            "Kabupaten Poso, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczPPEsQOMAz9lzyaj_ko9oHfrEpRkmvUDgePQ4JwRuoBd2e9DpkpDxQiEe_t4vthKCxIBusBPEfnKOGLmmUGd9T9iMZfyCjOrz0uqns9O0B0MDQ6tx4cxhfgtlw3QOQGfu6Kb7hNIF2WpHDxppNlofuP=w680-h509-s-no-gm?authuser=0",
            "08.00-17.00 WITA",
            "4.7 / 5.0",
            "https://maps.app.goo.gl/HvqQGvHmstDYW8jn8",
            "Air Terjun Saluopa adalah perwakilan keindahan alam yang luar biasa di Provinsi Sulawesi Tengah. Dengan derasnya air yang turun membasahi batu-batu besar yang diselimuti lumut, air terjun ini membentuk pemandangan yang sangat memukau.\n\n" +
                    "Melalui perjalanannya yang megah, air terjun Saluopa menawarkan pengalaman yang tak terlupakan bagi setiap pengunjungnya. Suara gemuruh air yang jatuh dari ketinggian, dipadu dengan keheningan sekitar, menciptakan atmosfer yang magis dan menenangkan.\n\n" +
                    "Dikelilingi oleh pepohonan hijau dan keasrian alam, air terjun Saluopa merupakan tempat yang ideal untuk melarikan diri dari hiruk pikuk kehidupan sehari-hari. Pengunjung dapat menikmati momen kebersamaan dengan alam, merasakan kesegaran udara, serta menikmati keindahan alam yang masih alami dan tak tersentuh.\n\n" +
                    "Dengan berbagai sudut pandang yang menakjubkan, air terjun Saluopa menjadi daya tarik utama bagi wisatawan yang mencari petualangan dan kedamaian. Keberadaannya tidak hanya sebagai destinasi wisata, tetapi juga sebagai saksi bisu keagungan alam dan kekayaan Indonesia yang patut dilestarikan."
        )

        val dummyLoc7 = Location(
            "Masjid Tua Bungku",
            "Kabupaten Morowali, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczPMdLm9r0s0sfE_pMATlwDxKxnvoG6OYMXHIE76OotvlD9VDsRnhh9LdCflfoKxmTe87l3FCgj5AjCNFlRzr_-5A8-YxLYlswm6ftdgFzBMMhtDUijp8VInuXv-PM5W9O0Ua6aEPhScrbCTmm6bvAZ-=w512-h340-s-no-gm?authuser=0",
            "Buka 24 Jam",
            "0.0 / 5.0",
            "https://maps.app.goo.gl/C49bUcHAxcLU5M5W6",
            "Masjid Kuno Bungku adalah sebuah landmark bersejarah yang menggambarkan kekayaan budaya dan keagungan arsitektur Islam di daerah Bungku, Sulawesi Tengah. Dibangun di Kelurahan Marsaoleh, Masjid ini menjadi bukti kehadiran Islam yang berkembang pesat di wilayah Bungku pada masa lalu.\n\n" +
                    "Sebagai pusat kegiatan keagamaan dan spiritual, Masjid Kuno Bungku telah menjadi saksi bisu dari berbagai peristiwa sejarah yang menggambarkan perkembangan Islam di daerah tersebut. Dibangun atas prakarsa Raja Bungku ke VII, yaitu Raja Moh. Baba, masjid ini tidak hanya menjadi tempat ibadah, tetapi juga pusat pendidikan, peradaban, dan kebudayaan Islam.\n\n" +
                    "Dengan kehadiran arsitektur yang megah dan ciri khasnya yang unik, Masjid Kuno Bungku menjadi tujuan wisata sejarah yang menarik bagi pengunjung dari berbagai penjuru. Keberadaannya menjadi penanda penting dalam perjalanan Islam di Sulawesi Tengah, serta merupakan warisan berharga yang harus dijaga dan dilestarikan oleh generasi mendatang.\n\n" +
                    "Dikelilingi oleh aura keagungan dan keheningan, Masjid Kuno Bungku menjadi tempat yang mempesona untuk merenungkan sejarah dan kebesaran Islam di daerah Bungku. Setiap detail arsitektur dan ornamen masjid ini menceritakan kisah-kisah yang melekat pada dinding-dindingnya, menciptakan suasana yang menggetarkan jiwa dan menginspirasi hati setiap pengunjungnya.\n\n"        )

        val dummyLoc8 = Location(
            "Sou Raja",
            "Kota Palu, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczN5NOGqFnDwh0U7DZBatMknj3EzpajC4accTOg-UCyI-KO-qN5doG7hxm7dFew6fd5wmk2LwgTi0tBNJ3q3T6nRTq0LFy0eamF-mZKBNEMLRA8ycJdRDJ9pTqHNKhAvtke-enVo_mAaidgBn21xpKTj=w1021-h599-s-no-gm?authuser=0",
            "06.00-18.00, Setiap hari",
            "4.3 / 5.0",
            "https://maps.app.goo.gl/ZCYmuML7uhCUWctP8",
            "Souraja, dengan segala kemegahannya, merupakan peninggalan bersejarah yang melambangkan keagungan dan kejayaan kerajaan Palu. Sejak awal berdirinya, istana ini telah menjadi tempat tinggal bagi para Raja Palu beserta keluarga mereka yang menggantikan satu sama lain dari generasi ke generasi.\n\n" +
                    "Bangunan Souraja yang megah dan anggun ini pertama kali dibangun pada abad ke-19 Masehi, menghadirkan pesona arsitektur klasik yang menjadi ciri khasnya. Sebagai salah satu bangunan bersejarah, Souraja telah diakui sebagai cagar budaya yang dilindungi oleh pemerintah, menjadikannya sebagai warisan berharga yang harus dilestarikan dan dijaga kelestariannya.\n\n" +
                    "Sebagai pengunjung, Anda akan dibawa pada sebuah perjalanan melintasi waktu saat mengunjungi Souraja. Setiap detail bangunan, dari fondasi hingga atap, memancarkan aura kemegahan dan keagungan masa lalu, memberikan pengalaman yang tak terlupakan tentang kehidupan di istana pada masa lampau.\n\n" +
                    "Dengan kebijaksanaan dan keberanian para Raja Palu yang pernah menghuni Souraja, bangunan ini menjadi saksi bisu dari berbagai peristiwa bersejarah dan kebijakan yang membentuk sejarah kerajaan. Keseluruhan struktur dan ruangannya telah dipertahankan dengan baik, memungkinkan Anda untuk merasakan atmosfer autentik dari masa lalu yang masih terasa hidup di setiap sudut Souraja."
        )

        val dummyLoc9 = Location(
            "Danau Poso",
            "Kabupaten Poso, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczMY1YqoawQOENyShyyuhoh79EJj2twtrva0AD6Vp838Ii-F72yKhxgM8G4vkme8TMqyLhqJ9TlpTQ_7KvyyJfy0-XcWwTwdZHE-G7nCbSAns4wdmHH5sh3Ez0odT8yVAUKmHGnX0jYdzeDojwrdN9R6=w1065-h599-s-no-gm?authuser=0",
            "Buka 24 Jam",
            "4.6 / 5.0",
            "https://maps.app.goo.gl/EnRLuoXxSpQhAHEp8",
            "Danau Poso, sebuah permata alam di tengah-tengah Pulau Sulawesi, mempesona dengan keunikan yang tak terlupakan. Salah satu daya tarik utamanya adalah pasirnya yang berwarna kuning keemasan, memberikan sentuhan eksotis yang menawan bagi pengunjungnya. Tak hanya itu, gelombang air yang menghiasi permukaan danau ini pun menyerupai ombak laut, menambahkan pesona yang tak terlukiskan.\n\n"+
                    "Namun, keistimewaan sejati Danau Poso terletak pada variasi warna airnya yang memukau. Saat mata memandang ke pinggiran danau, kita akan disuguhi dengan nuansa air hijau yang menyejukkan. Sementara itu, bagian tengah danau memancarkan keindahan warna biru yang begitu memikat, menciptakan kontras yang memukau di antara perpaduan alam yang megah.\n\n"+
                    "Setiap sudut Danau Poso menyimpan keajaiban alam yang menakjubkan, menawarkan pengalaman yang tak terlupakan bagi siapa pun yang berkesempatan untuk menjelajahinya. Keindahan alam yang terpancar dari danau ini tidak hanya memikat mata, tetapi juga menyentuh hati, memberikan kenangan yang abadi bagi setiap pengunjungnya."
        )

        val dummyLoc10 = Location(
            "Monumen Nosarara Nosabatutu",
            "Kota Palu, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczM6w40MM7rShWwWRSFK0SievFVUyAmYwRw0AHhkvC7ZqB0DF0nhH_NygnDjTC_4KbelqXGkOk-DIcwbgFOesvHgxlGUFDV5_yr8l0uwK7yNVbkxfqGrqrzZaTQfnlmlOlMnmXmEP-waNWRovP0fLelf=w899-h599-s-no-gm?authuser=0",
            "08.00-22.00 WITA, Setiap hari",
            "4.5 / 5.0",
            "https://maps.app.goo.gl/efqFJEAd2khKCH3L9",
            "Monumen Nosarara Nosabatutu, yang bermakna 'bersaudara dan bersatu' dalam Bahasa Kaili, menjelma menjadi lambang penting perdamaian di Sulawesi Tengah. Dalam langkah monumentalnya, pembangunan monumen Gong Perdamaian Nusantara di Kota Palu dilandasi oleh keprihatinan mendalam atas gelombang kekerasan sosial dan konflik yang melanda wilayah ini, terutama di Poso, Sigi, serta daerah-daerah lainnya.\n\n"+
                    "Duka yang menghimpit masyarakat korban konflik telah merasuki jiwa-jiwa, mendorong terciptanya dorongan kuat untuk membangun ikon perdamaian yang teguh di jantung kota Palu. Dengan tegaknya monumen ini, kita menginginkan agar pesan perdamaian tak lagi hanya sekadar kata-kata, namun menjadi pijakan kuat bagi setiap langkah yang kita tempuh menuju masa depan yang lebih sejahtera dan harmonis.\n\n"+
                    "Monumen Nosarara Nosabatutu menjadi bukti bisu akan keteguhan hati dan semangat yang menggelora untuk menciptakan masa depan yang lebih cerah bagi setiap warga Sulawesi Tengah. Melalui simbol ini, kita mengajak seluruh masyarakat, tanpa terkecuali, untuk bergandengan tangan dalam merajut kembali benang persaudaraan dan kesatuan, memupuk keberagaman sebagai sumber kekuatan, dan menegakkan keadilan serta perdamaian sebagai pijakan utama dalam menggapai cita-cita bersama."
        )

        locationData.add(dummyLoc1)
        locationData.add(dummyLoc2)
        locationData.add(dummyLoc3)
        locationData.add(dummyLoc4)
        locationData.add(dummyLoc5)
        locationData.add(dummyLoc6)
        locationData.add(dummyLoc7)
        locationData.add(dummyLoc8)
        locationData.add(dummyLoc9)
        locationData.add(dummyLoc10)

        return locationData
    }
}