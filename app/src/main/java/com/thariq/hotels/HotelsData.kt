package com.thariq.hotels

import java.util.*

object HotelsData {
    private val hotelNames = arrayOf(
        "Alila Seminyak",
        "Trans Resort Bali",
        "W Bali - Seminyak",
        "Double-Six Luxury Hotel Seminyak",
        "RIMBA Jimbaran BALI by AYANA",
        "The Apurva Kempinski Bali",
        "Hilton Bali Resort",
        "Conrad Bali",
        "Hotel Indigo Bali Seminyak Beach",
        "Anantara Uluwatu Bali Resort"
    )

    private val hotelDetails = arrayOf(
        "Ideal untuk bersenang-senang dan bersantai, Alila Seminyak terletak di area Seminyak Bali. Hanya 12,6 km dari pusat kota, lokasi hotel yang strategis memastikan para tamu dapat dengan cepat dan mudah mencapai banyak tempat menarik setempat. Dengan lokasinya yang strategis, hotel ini menawarkan akses mudah ke destinasi yang wajib dikunjungi di kota ini.\n\nFasilitas dan pelayanan yang diberikan oleh Alila Seminyak menjamin pengalaman menginap yang menyenangkan bagi para tamu. Sejumlah pilihan fasilitas kelas atas seperti resepsionis 24 jam, fasilitas untuk tamu dengan kebutuhan khusus, penyimpanan barang, Wi-fi di tempat umum, parkir valet dapat dinikmati di hotel ini.\n\nNikmati fasilitas kamar berkualitas tinggi selama Anda menginap di sini. Beberapa kamar memiliki televisi layar datar, produk pembersih, rak pakaian, teh gratis, minuman selamat datang gratis, yang disediakan untuk membantu Anda mengumpulkan tenaga kembali setelah lelah beraktivitas. Hotel ini menawarkan fasilitas fantastis, termasuk pantai pribadi, pusat kebugaran, kolam renang luar ruangan, spa, pijat, untuk membantu Anda bersantai setelah beraktivitas seharian di kota. Fasilitas super dan lokasi yang istimewa menjadikan Alila Seminyak tempat yang sempurna untuk menikmati penginapan Anda selama di Bali.",
        "Terletak strategis di Bali, The Trans Resort Bali adalah tempat yang cocok untuk menelusuri kota yang hidup ini. Hanya 10 km dari pusat kota, lokasi hotel yang strategis memastikan para tamu dapat dengan cepat dan mudah mencapai banyak tempat menarik setempat. Dengan lokasinya yang strategis, hotel ini menawarkan akses mudah ke destinasi yang wajib dikunjungi di kota ini.\n\nThe Trans Resort Bali menawarkan layanan sempurna dan semua fasilitas penting untuk memanjakan para wisatawan. Layanan kamar 24 jam, WiFi gratis di semua kamar, satpam 24 jam, layanan kebersihan harian, perapian hanyalah beberapa dari fasilitas yang membedakan The Trans Resort Bali dengan hotel-hotel lain di kota ini.\n\nNikmati fasilitas kamar berkualitas tinggi selama Anda menginap di sini. Beberapa kamar memiliki televisi layar datar, kolam pribadi, akses internet WiFi (gratis), bak mandi whirlpool, kamar bebas asap rokok, yang disediakan untuk membantu Anda mengumpulkan tenaga kembali setelah lelah beraktivitas. Baik Anda yang menyenangi kebugaran atau hanya ingin bersantai setelah beraktivitas sepanjang hari, Anda akan dihibur dengan fasilitas rekreasi kelas atas seperti ruangan yoga, hot tub, pusat kebugaran, sauna, kolam renang luar ruangan. Temukan perpaduan menarik antara layanan profesional dan beragam fitur di The Trans Resort Bali.",
        "Selami resor paling mendebarkan di Bali, di mana pemandangan kolam renang tropis WET® menjadi tempat bermalam di surga. Seimbangkan gaya dan jiwa Anda di FIT pusat kebugaran 24 jam kami. Segarkan diri setelah pantai dan manjakan diri Anda dengan kunjungan ke AWAY® Spa atau jelajahi berbagai barang modis di W The Store. Bersantaplah dengan gaya mewah di restoran kelas dunia, FIRE atau Starfish Bloo sebelum bersosialisasi semalaman di W Lounge dan Chill Bar atau saksikan matahari terbenam yang ajaib, lalu berpesta pora di WOOBAR.\n\nHotel ini memiliki 229 kamar yang ditata apik, banyak di antaranya termasuk televisi layar datar, akses internet kecepatan tinggi gratis – WiFi, kolam renang pribadi di vila, kamar merokok dan bebas rokok. Semua kamar dilengkapi dengan area shower dan bathtub yang mewah dan beberapa di antaranya memiliki skylight di bagian atas bathtub.",
        "Terletak strategis di Seminyak, Double-Six Luxury Hotel Seminyak adalah tempat yang cocok untuk menelusuri kota yang hidup ini. salah satu lokal kota yang paling populer. Hotel ini terletak 10,3 km dari pusat kota dan menyediakan aksesibilitas ke fasilitas kota yang penting. Dengan lokasinya yang strategis, hotel ini menawarkan akses mudah ke destinasi yang wajib dikunjungi di kota ini.\n\nPelayanan istimewa dan fasilitas yang unggul di Double-Six Luxury Hotel Seminyak akan membuat pengalaman menginap Anda tidak terlupakan. Ketika menginap di properti yang luar biasa ini, para tamu dapat menikmati layanan kamar 24 jam, WiFi gratis di semua kamar, satpam 24 jam, layanan kebersihan harian, layanan taksi.\n\nNikmati fasilitas kamar berkualitas tinggi selama Anda menginap di sini. Beberapa kamar memiliki televisi layar datar, kamar mandi tambahan, toilet tambahan, telepon di kamar mandi, cermin, yang disediakan untuk membantu Anda mengumpulkan tenaga kembali setelah lelah beraktivitas. Daftar lengkap fasilitas rekreasi tersedia di hotel termasuk ruangan yoga, pusat kebugaran, sauna, kolam renang luar ruangan, spa. Double-Six Luxury Hotel Seminyak adalah pilihan cerdas bagi wisatawan ke Bali, menawarkan masa inap yang santai dan bebas repot setiap saat.",
        "RIMBA Jimbaran BALI by AYANA Kebun seluas 8 hektar terletak di lahan AYANA seluas 90 hektar yang menghadap ke Teluk Jimbaran dan hanya 10 kilometer dari bandara Bali. Properti bintang 5 yang mewah ini menawarkan 403 kamar modern bergaya yang dipadukan dengan pemandangan matahari terbenam yang menakjubkan dan layanan legendaris yang sempurna untuk liburan pasangan atau liburan keluarga yang meremajakan. Desain RIMBA Jimbaran BALI oleh AYANA adalah edgy dan inovatif, dan kamar-kamar yang ditata apik adalah kontemporer, modis, dan apik, dengan penekanan pada bahan dan sentuhan akhir alami. Di antara akomodasi terbaik di Bali, Kamar Akses Kolam Renang memiliki akses langsung ke kolam renang semi-pribadi, sementara suite yang luas menikmati pemandangan yang ditinggikan dan fasilitas premium. Para tamu RIMBA Jimbaran BALI by AYANA menikmati akses prioritas ke Rock Bar yang terkenal dan termasuk 19 restoran dan bar lainnya; pantai pasir putih paling indah dan terpencil di Bali; 12 kolam renang; Spa kelas dunia dengan Air Laut Aquatonic; golf-putting dan pusat kebugaran; dan WiFi gratis di area umum. Properti ini juga menyediakan layanan antar-jemput gratis ke Bali Collection Shopping Centre serta AYANA Resort. Taman bermain anak-anak, pusat bisnis, dan meja layanan wisata termasuk di antara fasilitasnya. Dengan banyaknya tempat makan, para tamu juga dapat menikmati berbagai pengalaman sarapan. Semua tamu RIMBA Jimbaran BALI by AYANA dapat memilih untuk menikmati sarapan prasmanan di restoran To'ge atau restoran Padi, keduanya menyajikan beragam pilihan sarapan favorit Barat dan Asia.",
        "Terletak dengan baik di area pantai kota Bali, The Apurva Kempinski Bali menyediakan tempat yang kondusif bagi Anda untuk beristirahat dari hari-hari sibuk Anda. Dari sini, para tamu dapat memanfaatkan semua yang ditawarkan kota semarak ini. Dengan lokasinya yang strategis, properti ini menawarkan akses mudah ke destinasi yang wajib dikunjungi di kota ini.\n\nThe Apurva Kempinski Bali menawarkan berbagai fasilitas untuk memperkaya penginapan Anda di Bali. Properti ini menawarkan berbagai fasilitas di tempat untuk memuaskan bahkan tamu yang paling cerdas sekalipun.\n\nSemua akomodasi tamu memiliki fasilitas yang bijaksana untuk memastikan rasa nyaman yang tak tertandingi. Sejumlah penawaran rekreasi properti memastikan Anda memiliki banyak hal yang harus dilakukan selama Anda tinggal. Temukan perpaduan menarik antara layanan profesional dan beragam fitur di The Apurva Kempinski Bali.",
        "Di Hilton Bali Resort, para tamu dapat merasakan suasana yang harmonis dan merasakan kemewahan yang mutlak. Berlokasi sempurna 40 meter di atas tebing, hotel ini merupakan lokasi yang ideal untuk liburan romantis di mana pemandangan menghadap ke Samudera Hindia dimaksudkan untuk dilihat. Para tamu dapat merangkul mistik Bali dengan pesona alam, keindahan, dan budayanya yang menakjubkan. Dengan keramahannya yang ramah, Hilton Bali Resort menawarkan 401 kamar dan 19 vila yang menampilkan desain abadi di mana para tamu dapat bersantai dan memanjakan diri dengan fasilitas yang sangat baik dan masakan lokal yang eksotis dari empat restoran. Sorotan Hilton Bali Resort adalah vila kolam renang yang menyediakan taman hijau dengan kolam renang pribadi, gazebo semi terbuka dengan ruang tamu, dan teras luas yang menghadap ke Samudra Hindia untuk pengalaman elegan yang paling sempurna. Kamar tidur utama menawarkan tempat tidur king dengan ornamen yang menampilkan layar LCD besar dengan sistem audio terbaru. Sebuah sofa daybed berukir indah berada di bawah jendela besar, menawarkan area membaca yang nyaman yang juga dapat diubah menjadi tempat tidur tambahan. Dengan semua lokasi yang sempurna dan fasilitas mewah, Hilton Bali Resort adalah tempat yang ideal di mana Anda dapat menghabiskan liburan yang tak terlupakan di Bali.",
        "Terinspirasi oleh keindahan dan keramahan 'Pulau Dewata', renovasi Conrad Bali menciptakan pengalaman resor pantai tropis terbaik. Bersantai di samping kolam renang utama dan laguna, bersantap di Suku Restaurant, atau bersantai di salah satu kamar yang baru direnovasi. Resor tepi pantai yang mewah ini terletak di pantai selatan Bali, hanya 12,2 km dari Bandara Internasional Ngurah Rai. Dengan taman yang rimbun seluas tujuh hektar dan pantai berpasir sepanjang 350 meter, resor ini menghadirkan lebih banyak pilihan untuk liburan pantai Samudra Hindia yang luar biasa. Conrad Bali menawarkan pemandangan panorama laut, kolam renang, dan taman. Resor ini memiliki 358 kamar dan suite, pilihan bersantap yang terinspirasi, ruang pertemuan dan acara yang luas untuk semua kesempatan, dan fasilitas rekreasi termasuk Jiwa Spa. Conrad Suites yang eksklusif, terletak di sayap pribadi, menawarkan privasi yang lebih baik dengan layanan yang dipersonalisasi. Resor ini juga merupakan rumah bagi 'Infinity', struktur kaca segitiga yang megah dan salah satu tempat pernikahan tepi pantai modern terbesar di Bali.",
        "Saat mengunjungi Bali, Anda akan merasa seperti di rumah sendiri di Hotel Indigo Bali Seminyak Beach, yang menawarkan akomodasi berkualitas dan layanan hebat. Dari sini, para tamu dapat menikmati akses mudah ke semua yang ditawarkan kota yang semarak ini. Dengan lokasinya yang strategis, hotel ini menawarkan akses mudah ke destinasi yang wajib dikunjungi di kota ini.\n\nDi Hotel Indigo Bali Seminyak Beach, pelayanan istimewa dan fasilitas yang unggul akan membuat pengalaman menginap Anda tidak terlupakan. Ada beberapa fasilitas hotel ini seperti layanan kamar 24 jam, satpam 24 jam, layanan kebersihan harian, WiFi gratis di semua kamar, check-in/check-out pribadi.\n\nSemua akomodasi tamu memiliki fasilitas yang bijaksana untuk memastikan rasa nyaman yang tak tertandingi. Baik Anda yang menyenangi kebugaran atau hanya ingin bersantai setelah beraktivitas sepanjang hari, Anda akan dihibur dengan fasilitas rekreasi kelas atas seperti ruangan yoga, pelajaran berselancar, pusat kebugaran, kolam renang luar ruangan, spa. Hotel Indigo Bali Seminyak Beach adalah pilihan cerdas bagi wisatawan ke Bali, menawarkan masa inap yang santai dan bebas repot setiap saat.",
        "Jika apa yang Anda cari adalah hotel yang terletak strategis di Bali, carilah Anantara Uluwatu Bali Resort. Hanya 30km dari pusat kota, lokasi hotel yang strategis memastikan para tamu dapat dengan cepat dan mudah mencapai banyak tempat menarik setempat. Surga untuk beristirahat dan bersantai, hotel ini akan menyediakannya kepada Anda dan terletak hanya beberapa langkah dari beberapa atraksi kota ini seperti Pantai Padang Padang, Klapa, New Kuta Golf. Anantara Uluwatu Bali Resort terkenal akan pelayanannya yang berkualitas dan staf yang ramah serta memenuhi harapan. Pusat bisnis, concierge, layanan kamar 24 jam, kotak penyimpanan aman, dan Wi-Fi di tempat umum hanyalah beberapa fasilitas yang membedakan properti ini dari hotel-hotel lain di kota ini. Semua akomodasi tamu memiliki fasilitas yang bijaksana untuk memastikan rasa nyaman yang tak tertandingi. Apakah Anda seorang penggemar kebugaran atau hanya mencari cara untuk bersantai setelah hari yang melelahkan, Anda akan dihibur dengan fasilitas rekreasi kelas atas seperti sauna, gym, ruang mandi uap, spa, dan perawatan pijat. Botol Biru Bar & Grill juga siap melayani tamu untuk masakan yang memanjakan. Fasilitas super dan lokasi yang istimewa menjadikan Anantara Uluwatu Bali Resort tempat yang sempurna untuk menikmati penginapan Anda selama di Bali."
    )

    private val hotelPhones = arrayOf(
        "(0361) 3021888",
        "(0361) 8981234",
        "(0361) 3000106",
        "(0361) 730466",
        "(0361) 8468468",
        "(0361) 2092288",
        "(0361) 773377",
        "(0361) 778788",
        "(0361) 2099999",
        "(0361) 8957555"
    )

    private val hotelPrices = arrayOf(
        "Rp4.345.623",
        "Rp1.611.023",
        "Rp4.810.848",
        "Rp1.844.339",
        "Rp2.109.712",
        "Rp5.469.265",
        "Rp2.543.999",
        "Rp2.953.050",
        "Rp5.739.049",
        "Rp8.288.500"
    )

    private val hotelRates = arrayOf(
        "5.0",
        "5.0",
        "5.0",
        "5.0",
        "5.0",
        "5.0",
        "5.0",
        "5.0",
        "5.0",
        "5.0"
    )

    private val hotelImages = intArrayOf(
        R.drawable.alila,
        R.drawable.trans,
        R.drawable.wbali,
        R.drawable.doubleluxury,
        R.drawable.rimba,
        R.drawable.apurva,
        R.drawable.hilton,
        R.drawable.conrad,
        R.drawable.indigo,
        R.drawable.anantara
    )

    val listData: ArrayList<Hotels>
        get() {
            val list = arrayListOf<Hotels>()
            for (position in hotelNames.indices) {
                val hotel = Hotels()
                hotel.name = hotelNames[position]
                hotel.detail = hotelDetails[position]
                hotel.phone = hotelPhones[position]
                hotel.price = hotelPrices[position]
                hotel.rate = hotelRates[position]
                hotel.photo = hotelImages[position]
                list.add(hotel)
            }
            return list
        }
}