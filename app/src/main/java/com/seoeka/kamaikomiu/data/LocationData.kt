package com.seoeka.kamaikomiu.data

object LocationData {
    fun getLocationData(): List<Location>{
        val locationData = arrayListOf<Location>()
        val dummyLoc1 = Location(
            "Taman Nasional Lore Lindu",
            "Dodolo, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczP1i6TUCk2hzyfFKWklJBNVtbP4F4EyOmcZHemJH8YnYCEszA43jGU98nuR7TkDeCwifoFalYFGSX0HaXvSdbUK4VlMKR9Cj_CTNJati_bnSSwi4GOhvHjlNq36mEF_iufr1bXs3IR1qsViSsL0RYaW=w680-h435-s-no-gm?authuser=0",
            "Buka 24 jam, Setiap hari",
            "4.4 / 5.0",
            "https://maps.app.goo.gl/SE9YyCMGTj1KmA3X7",
            "Taman Nasional Lore Lindu (TNLL) merupakan salah satu taman nasional di Indonesia yang terletak di provinsi Sulawesi Tengah berjarak sekitar 60 km selatan Kota Palu" +
                    "Merupakan habitat dari berbagai spesies langka, termasuk 77 burung endemik Sulawesi."
        )

        val dummyLoc2 = Location(
            "Taman Nasional Kepulauan Togean",
            "Tojo Una-una, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczMwqdl5Qq_R0D3fR5sFITas3eAlvobS94WNReOGxLLxitAm-pU3P1yUAmmADMhQ2JvLAmua3_Tv6Sq9FQC4V3Yn-fgP-STp04-ZlevxhBiR9h30YZFXdCI-ovdLBxK2d4-msziO_P9gjkuqalLgh7wb=w1080-h383-s-no-gm?authuser=0",
            "Buka 24 jam, Setiap hari",
            "4.6 / 5.0",
            "https://maps.app.goo.gl/mSajq9swWXrNZ2o1A",
            "Kepulauan Togean di Kabupaten Tojo Una-Una, Sulawesi Tengah, dikenal menyajikan pemandangan pantai dan laut yang indah, dengan formasi batu karang yang menjulang."
        )

        val dummyLoc3 = Location(
            "Gedung Juang",
            "Palu, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczPdvRJPH8eaf8r0zl2sUjQ1fvqF6IfBcXacsXJ9OEwoUB-O-0Zv5-ZSe2vFeG5oV47KmO1SdJxYmSwa4kgqlVsWC3E47e-iMsVLuQtPYMzi2_fE0JK1P_q6zuv0O5xOgRLsIE1paN1PIoNI6qe8LL12=w1093-h515-s-no-gm?authuser=0",
            "08.00-17.00 WITA, Tutup akhir pekan",
            "4.4 / 5.0",
            "https://maps.app.goo.gl/rbnchtzDnzNtFAp49",
            "Gedung juang ini menjadi saksi bisu perjalanan sejarah indonesia di tanah Kaili, Sulawesi Tengah. Ditempat inilah para Kolonial Belanda berkantor, menjajah, merundingkan, memutuskan, dan menyerahkan kembali kemerdekaan kepada rakyat di Sulawesi Tengah."
        )

        val dummyLoc4 = Location(
            "Pusat Laut",
            "Donggala, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczOnK0H1nZAYFrSGBoaMua3M333Mv2hwznVNHtC-SGD17T5yvcSbUrYEmeA2DEseWBqvgBGTsCuF4uWSzBhZ-XUkGozzdlzwOoH7mblx9wQpTw6_i9HjfjGrmO1DNkFXbjIX3tkVj7jLiRRZbZlUxrDz=w700-h525-s-no-gm?authuser=0",
            "07.00-18.00 WITA, Setiap hari",
            "4.4 / 5.0",
            "https://maps.app.goo.gl/BBwZ1AYRQY6RdVhV9",
            "Nama ‘Pusentasi’ atau Pusat Laut yang dikenal oleh masyarakat sekitar, berasal dari bahasa suku Kaili, suku terbesar yang menghuni Prov. Sulawesi Tengah yaitu “Pusen” yang artinya Pusat dan “Tasi” yang berarti Laut. "+
                    "Menurut cerita, Pusat Laut ini merupakan sebuah fenomena alam yang terbentuk akibat ambrolnya tanah secara tiba tiba kedalam tanah yang bentuknya kebetulan melingkar seperti sebuah sumur. Alasan mengapa runtuhnya permukaan tanah memunculkan air pada tempat tersebut, adalah karena letaknya sangat berdekatan dengan bibir pantai."
        )

        val dummyLoc5 = Location(
            "Danau Paisupok",
            "Banggai Kepulauan, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczMzArno-jqUzhigy62aQapDQXil70fLjsfsdmYthFo3WzJ-JAg_LW8tmcCTBs5QBJ5RBqdvsYrpzKaCipF7X4NdUH81fINIq7gnTYZ8d0AN2h-vkWZiuyJPoolObmNcOS44mHZhFIdraGrBaAh_csh9=w668-h464-s-no-gm?authuser=0",
            "Buka 24 Jam, Setiap Hari",
            "4.8 / 5.0",
            "https://maps.app.goo.gl/zQHjXUZhJngTCsNB9",
            "Danau Paisupok adalah danau alami yang berada di Desa Luk Panenteng, Bulagi Utara, Kabupaten Banggai Kepulauan, Sulawesi Tengah. Danau Paisupok memiliki keindahan dan kejernihan air yang menarik. "+
                    "Selain itu, disekitar danau terdapat hutan yang masih alami dan asli dimana di dalamnya terdapat hewan endemik yang hanya bisa ditemukan di Kabupaten Banggai Kepulauan yaitu Gagak Peling dan Tarsius. Berdekatan dengan Danau Paisupok terdapat permukiman Desa Luk Panenteng yang memiliki kekayaan budaya suku Sea-sea, suku asli wilayah Banggai."
        )

        val dummyLoc6 = Location(
            "Air Terjun Saluopa",
            "Poso, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczPPEsQOMAz9lzyaj_ko9oHfrEpRkmvUDgePQ4JwRuoBd2e9DpkpDxQiEe_t4vthKCxIBusBPEfnKOGLmmUGd9T9iMZfyCjOrz0uqns9O0B0MDQ6tx4cxhfgtlw3QOQGfu6Kb7hNIF2WpHDxppNlofuP=w680-h509-s-no-gm?authuser=0",
            "08.00-17.00 WITA",
            "4.7 / 5.0",
            "https://maps.app.goo.gl/HvqQGvHmstDYW8jn8",
            "Air terjun Saluopa menampilkan keindahan alam yang megah dengan air terjun yang mengalir deras melalui batu-batu besar yang ditumbuhi oleh lumut. Keberadaan air terjun ini memberikan suasana hening dan memukau, di mana pengunjung dapat menikmati keindahan alam yang alami dan menenangkan"
        )

        val dummyLoc7 = Location(
            "Masjid Tua Bungku",
            "Morowali, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczPMdLm9r0s0sfE_pMATlwDxKxnvoG6OYMXHIE76OotvlD9VDsRnhh9LdCflfoKxmTe87l3FCgj5AjCNFlRzr_-5A8-YxLYlswm6ftdgFzBMMhtDUijp8VInuXv-PM5W9O0Ua6aEPhScrbCTmm6bvAZ-=w512-h340-s-no-gm?authuser=0",
            "Buka 24 Jam",
            "- / 5.0",
            "https://maps.app.goo.gl/C49bUcHAxcLU5M5W6",
            "Masjid kuno Bungku terletak di Ibu Kota Kecamatan Bungku Tengah tepatnya di Kelurahan Marsaoleh. Berdirinya Bangunan Masjid Tua Bungku tersebut dilatar belakangi oleh Penyeberan Islam Di Bungku yang pada saat itu diprakarsai oleh Raja Bungku ke VII yakni Raja Moh. Baba."
        )

        val dummyLoc8 = Location(
            "Sou Raja",
            "Kota Palu, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczN5NOGqFnDwh0U7DZBatMknj3EzpajC4accTOg-UCyI-KO-qN5doG7hxm7dFew6fd5wmk2LwgTi0tBNJ3q3T6nRTq0LFy0eamF-mZKBNEMLRA8ycJdRDJ9pTqHNKhAvtke-enVo_mAaidgBn21xpKTj=w1021-h599-s-no-gm?authuser=0",
            "06.00-18.00, Setiap hari",
            "4.3 / 5.0",
            "https://maps.app.goo.gl/ZCYmuML7uhCUWctP8",
            "Souraja adalah Istana Raja Palu, karena sejak didirikannya bangunan ini ditempati oleh Raja-Raja Palu dan keluarganya silih berganti oleh keluarganya. Kepemilikan bangunan ini pun berlaku secara turun-temurun.\n" +
                    "Bangunan Sou Raja dibangun pertama kali pada abad ke-19 Masehi, sehingga ia merupakan bangunan cagar alam yang dijaga kelestariannya oleh pemerintah. Tidak ada yang diubah sedikit pun dari bangunan tersebut, sehingga sebagai pengunjung Anda akan mendapati bangunan yang sama dengan bangunan Souraja yang dulu."
        )

        val dummyLoc9 = Location(
            "Danau Poso",
            "Poso, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczMY1YqoawQOENyShyyuhoh79EJj2twtrva0AD6Vp838Ii-F72yKhxgM8G4vkme8TMqyLhqJ9TlpTQ_7KvyyJfy0-XcWwTwdZHE-G7nCbSAns4wdmHH5sh3Ez0odT8yVAUKmHGnX0jYdzeDojwrdN9R6=w1065-h599-s-no-gm?authuser=0",
            "Buka 24 Jam",
            "4.6 / 5.0",
            "https://maps.app.goo.gl/EnRLuoXxSpQhAHEp8",
            "Danau Poso memiliki keunikan yang menarik perhatian, terutama dengan pasirnya yang berwarna kuning keemasan. Selain itu, gelombang air di danau ini juga menyerupai gelombang laut, menciptakan suasana yang memikat." +
                    "Namun, yang membuat Danau Poso semakin istimewa adalah variasi warna airnya yang cukup unik. Bagian pinggir danau menampilkan warna air hijau, sementara bagian tengahnya memancarkan warna biru yang menakjubkan."
        )

        val dummyLoc10 = Location(
            "Monumen Nosarara Nosabatutu",
            "Palu, Sulawesi Tengah",
            "https://lh3.googleusercontent.com/pw/AP1GczM6w40MM7rShWwWRSFK0SievFVUyAmYwRw0AHhkvC7ZqB0DF0nhH_NygnDjTC_4KbelqXGkOk-DIcwbgFOesvHgxlGUFDV5_yr8l0uwK7yNVbkxfqGrqrzZaTQfnlmlOlMnmXmEP-waNWRovP0fLelf=w899-h599-s-no-gm?authuser=0",
            "08.00-22.00 WITA, Setiap hari",
            "4.5 / 5.0",
            "https://maps.app.goo.gl/efqFJEAd2khKCH3L9",
            "Monumen Nosarara Nosabatutu yang dalam Bahasa Kaili (suku asli di Sulawesi Tengah) memiliki arti bersaudara dan bersatu. Di Kota Palu pembangunan monumen Gong Perdamaian Nusantara ini  dilatar belakangi oleh keprihatinan atas terjadinya kekerasan sosial dan konflik di wilayah Sulawesi Tengah seperti Poso, Sigi, "+
                    "dan wilayah lainnya yang telah menimbulkan duka mendalam bagi masyarakat korban kekerasan sosial dan konflik di wilayah tersebut, sehingga dirasa perlu membangun simbol-simbol perdamaian di kota Palu dengan tujuan untuk mengingatkan kembali masyarakat dan generasi berikutnya agar tidak terulang lagi kekerasan sosial dan konflik di Sulawesi Tengah."
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