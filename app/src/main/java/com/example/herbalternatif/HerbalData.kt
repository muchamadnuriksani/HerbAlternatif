package com.example.herbalternatif

object HerbalData {
    private val herbalNames = arrayOf(
        "Bunga Kenop",
        "Bunga Matahari",
        "Daun Seledri",
        "Jahe",
        "Jintan Hitam",
        "Kayu Manis",
        "Kemuning",
        "Kumis Kucing",
        "Kunyit",
        "Lidah Buaya"
    )

    private val herbalDetails = arrayOf(
        "Punya warna yang cerah dan bentuk yang unik, bunga kenop kerap dijadikan hiasan di halaman rumah. Di balik itu, tanama yang juga dikenal sebagai bunga kancing atau kembang puter ini ternyata bermanfaat sebagai obat-obatan alami.",
        "Bunga matahari dapat memberikan tampilan hangat di pekarangan rumah. Tak hanya itu saja ternyata, sebab bunga ini mengandung banyak manfaat lain baik dari biji hingga minyak yang dimilikinya. Biji dan minyak bunga matahari mengadung banyak vitamin, magnesium, kalsium, hingga kalium.",
        "Seledri umumnya digunakan sebagai pelengkap makanan berkuah atau oseng-oseng. Rasanya gurih dan menambah citarasa tersendiri pada makanan. Orang-orang di tanah Sunda biasanya melahap seledri mentah sebagai lalapan.",
        "Menghangatkan diri di tengah udara dingin seperti sekarang ini bisa dilakukan dengan mengonsumsi minuman jahe hangat. Di Indonesia sendiri, jahe banyak dibudidayakan dengan berbagai macam jenis. Bahkan menumbuhkan tanaman herbal ini di halaman rumah pun bisa dilakukan. Beberapa jenis jahe tersebut antara lain jahe kuning, jahe merah, dan juga jahe gajah.",
        "Obat herbal ini disebut-sebut digunakan oleh Nabi Muhammad SAW untuk pengobatan di zaman dulu. Habbatusauda sendiri dikenal sebagai jintan hitam di Indonesia.",
        "Rempah lain yang biasanya bisa dikembangkan di rumah serta dipanen sendiri ialah kayu manis. Mencampur tanaman herbal satu ini sebagai bumbu masakan dapat menambah aroma yang menggugah selera. Kayu manis pun kerap digunakan untuk campuran minuman seperti wedang dan juga teh manis. Dicampur madu tentu akan membuat minuman dengan kayu manis jadi lebih terasa sedap.",
        "Dilansir 99.co Indonesia dari situs tanamtanaman.com, tanaman kemuning kerap dijadikan bunga hias di rumah.  Belum banyak yang tahu bahwa bunga cantik ini memiliki kandungan 60 senyawa minyak atsiri.  Tidak hanya itu, di dalam kemuning pun terkandung kumarin, flavonoid, alkaloid indol dan tannin, saponin, dan glikosida jantung.",
        "Bunga kumis kucing memiliki warna putih dengan bentuk memanjang layaknya kumis dari hewan kucing. Tanaman herbal ini banyak tumbuh di Indonesia, termasuk di pekarangan rumah. Kumis kucing yang tumbuh di Indonesia memiliki kekhasan kandungan zat aktif seperti orthosiphon, sinensetin, lipophilic, flavonoid, orthosiphol, dan rosmarinic acid. Kandungan tersebut hanya dimiliki kumis kucing yang tumbuh di daerah tropis dan subtropis.",
        "Rempah kunyit atau biasa disebut turmeric dalam bahasa Inggris kerap dijadikan pewarna alami untuk nasi tumpeng atau nasi kuning. Rasa serta aroma kunyit di dalam makanan begitu khas, begitupula ketika ia dijadikan bahan membuat jamu siap minum.",
        "Sari lidah buaya atau kerap disebut aloe vera beberapa waktu ke belakang ini sangat digemari oleh perempuan. Banyak disebutkan, ekstrak aloe yang diusapkan pada wajah mampu menjaga kelembapan dan menghambat penuaan. Tidak perlu membeli, jika tanaman herbal ini tumbuh di rumah, kamu pun bisa memanfaatkannya sesuka hati. Biasanya aloe yang telah dibersihkan digunakan sebagai pelembap serta penebal rambut."
    )

    private val herbalMeds = arrayOf(
        "penyembuh batuk, demam, sakit kepala, radang mata, disentri, penambah nafsu makan, hingga asma",
        "Biji bunga matahari bisa untuk membantu mencegah keram otot, mencegah osteoporosis dan mencegah diabetes. Dan minyaknya digunakan untuk nutrisi orang yang sedang diet dan menjadi obat anti inflamasi",
        "Daunnya bisa digunakan untuk obat alami rematik dan masalah sendi, menurunkan tekanan darah, diabetes, asma, dan mata kering.",
        "Jahe bermanfaat untuk diantaranya meringankan nyeri perut saat menstruasi, mengobati masalah infeksi pada saluran pernafasan bagian atas, dll.",
        "Manfaat dari jintan hitam diantaranya sebagai pereda nyeri, anti bakteri, radang, maag, hipertensi, bakteri, virus, menangkal gangguan imun, obat diabetes, dll.",
        "Obat mencegah sakit jantung, kanker, mengurangi peradangan, meringankan perut kembung, mengurangi rasa nyeri akibat rematik, dan mengobati infeksi saluran pernafasan.",
        "Daun Kemuning berkhasiat sebagai penurun kadar kolesterol dalam darah, anestesia, sedatif, antiradang, antirematik, penghilang bengkak, pelangsing tubuh, pelancar peredaran darah, dan penghalus kulit.",
        "Mengobati penyakit-penyakit yang berhubungan dengan organ ginjal, menyembuhkan diabetes, hipertensi, rematik, dan asam urat.",
        "Menghilangkan bau badan, membunuh virus, menurunkan tekanan darah tinggi, menyembuhkan radang gusi, mengurangi rasa gatal, dan meredakan demam.",
        "Lidah buaya bisa digunakan untuk membantu penyembuhan luka pada kulit dengan lebih cepat dan gangguan pencernaan."
    )

    private val herbalUses = arrayOf(
        "Cara menggunakannya adalah dengan merebus beberapa kuntum bunga ditambah dengan tanaman jahe. Baik kering atau masih segar, air rebusan bunga kenop dan jahe dapat diminum tiga kali sehari.",
        "Salah satu olahannya yaitu digunakan sebagai minuman herbal. Rebus kelopak bunga matahari atau campur ke dalam teh. Kelopak bunga matahari dapat digunakan sebagai campuran minuman untuk meringankan sakit kepala, radang payudara dan sebagainya.",
        "Salah satu olahannya yaitu dijadikan jus, cukup potong kecil-kecil seledri dan bahan lain ke dalam blender. Lalu campurkan air perasan lemon dan es batu. Kemudian saring sebelum disajikan",
        "Wedang jahe merupakan salah satu olahan herbal berbahan jahe. Siapkan jahe potong tipis, air dan gula merah. Rebus air sampai mendidih, masukkan jahe dan aduk. Setelah itu masukkan gula merah dan aduk sampai larut. Biarkan beberapa menit dan angkat. Wedang jahe siap dihidangkan.",
        "Untuk penyakit diabetes caranya campurkan secangkir jintan hitam, secangkir biji mustard, setengah cangkir kulit delima , dan setengah cangkir fumaria kering. Semua bahan dihaluskan menjadi bubuk. Konsumsi satu sendok teh setiap hari selama dua bulan.",
        "Salah satu olahan kayu manis adalah dengan menambahkan satu sendok teh madu ke dalam cangkir berisi rebusan kayu manis untuk menjaga daya tahan tubuh.",
        "Untuk nyeri punggung, cuci 30 gram akar kemuning kering dan 10 gram jahe merah muda direbus dengan 400ml air. Kemudian saring ramuan setelah dingin dan diminum 2 kali sehari.",
        "Untuk pengobatan penderita rematik, siapkan daun kumis kucing sebanyak 5 lembar dan rebus dengan 3 gelas air. Kemudian tunggu sampai dingin dan siap untuk diminum. Dosis yang dianjurkan diminum 3 kali sehari sebanyak setengah gelas.",
        "Lumatkan 2 1/2 sendok teh bubuk kunyit/parutan kunyit dan 1/3 gelas madu hingga membentuk pasta lalu simpan didalam toples. Untuk tiap satu gelas jamu, ambil 1 sendok pasta olahan dan siram dengan air mendidih. Sebagai pelengkap, tambahkan air perasan lemon dan beberapa jumput merica bubuk.",
        "Olahan teh aloe vera bisa digunakan untuk mengatasi gangguan pencernaan. Caranya yaitu cuci bersih kulit lidah buaya, iris kulit menjadi kecil dan dijemur hingga kering. Untuk penyajian hanya dengan menyeduh seperti membuat teh biasa dan beri gula atau susu sesuai selera."
    )

    private val herbalImages = intArrayOf(R.drawable.bunga_kenop,
        R.drawable.bunga_matahari,
        R.drawable.daun_seledri,
        R.drawable.jahe,
        R.drawable.jintan_hitam,
        R.drawable.kayu_manis,
        R.drawable.kemuning,
        R.drawable.kumis_kucing,
        R.drawable.kunyit,
        R.drawable.lidah_buaya)

    val listData: ArrayList<Herbal>
        get() {
            val list = arrayListOf<Herbal>()
            for (position in herbalNames.indices) {
                val herbal = Herbal()
                herbal.name = herbalNames[position]
                herbal.detail = herbalDetails[position]
                herbal.meds = herbalMeds[position]
                herbal.uses = herbalUses[position]
                herbal.photo = herbalImages[position]
                list.add(herbal)
            }
            return list
        }
}