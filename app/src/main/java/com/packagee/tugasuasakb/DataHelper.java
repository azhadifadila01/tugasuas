package com.packagee.tugasuasakb;

/*
    Tanggal pengerjaan  : 11/8/2020
    NIM                 : 10117277
    Nama                : Azhadi Fadila
    Kelas               : IF - 8
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "twisata.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        addDataWisata(db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }

    private void addDataWisata(SQLiteDatabase db){
        //sql = "INSERT INTO tempatwisata (no, nama, deskripsi, v, v1) VALUES ('2', '', '', '-6.759795', '107.6097333');";
        //db.execSQL(sql);
        String sql = "create table tempatwisata(no integer primary key, nama text null, deskripsi text null, v text null, v1 text null, gambar text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO tempatwisata (no, nama, deskripsi, v, v1, gambar) VALUES ('1', 'Kawah Putih', 'Bandung merupakan daerah dataran tinggi yah kawan, terletak pada jajaran pegunungan salak. Membuat tempat ini memiliki udara yang sajuk, wisata kawah putih yang berada pada daerah Ciwidey yang memakan waktu perjalanan 1 jam ke arah selatan kota Bandung. Wisata kawah ini terbentuk dari letusan gunung Patuha yang terjadi beberapa ratus tahun silam. Seiring berjalannya waktu bekas dari erupsi dahsyat tersebut berbekas dan membentuk sebuah kawah.', '-7.166154', '107.399951', 'kawah_putih');";
        db.execSQL(sql);
        sql = "INSERT INTO tempatwisata (no, nama, deskripsi, v, v1, gambar) VALUES ('2', 'Air Panas Ciater ', 'Bergeser sedikit kearah bawah dari tingginya pegunungan kita akan menemui pemandian air panas Ciater. Pemandian air panas yang satu ini tidak bisa dilepaskan dari pra vulkanik gunung Tangkuban Perahu. Mengingat dari aktifitas tersebut dapat menghasilkan sumber-sumber air panas yang dapat Anda nikmati bersama keluarga. Memilih wisata ini untuk menghabiskan waktu sembari bersantai merupakan pilihan yang tepat.', '-6.7380853', '107.6566092', 'pemandian_ciater');";
        db.execSQL(sql);
        sql = "INSERT INTO tempatwisata (no, nama, deskripsi, v, v1, gambar) VALUES ('3', 'Situ Patenggang ', 'Masih belum bergeser dari wilayah pegunungan lokasi wisata yang satu ini merupakan sebuah danau. Karena masih belum bergeser dari pembahasan awal danau yang satu ini terletak pada ketinggian 1685 MDPL. Danau yang satu ini memiliki keunikan tersendiri yaitu di kelilingi oleh hamparan perkembunan teh yang luas.', '-7.1672928', '107.3532956', 'situ_patenggang');";
        db.execSQL(sql);
        sql = "INSERT INTO tempatwisata (no, nama, deskripsi, v, v1, gambar) VALUES ('4', 'Taman Hutan Raya IR Juanda', 'Jika Anda sedang berada di Bandung tak salah bila ingin mampir ke THR Juanda atau yang lebih dikenal tahura Juanda. Lokasi wisata tak begitu jauh dari pusat kota sehingga begitu strategis. Ada beragam pilihan wisata di hutan konservatif ini. Menariknya destinasi ini merupakan lumbung paru-paru oksigen kota Bandung sekaligus destinasi indah.', '-6.8565917', '107.6326667', 'taman_djuanda');";
        db.execSQL(sql);
        sql = "INSERT INTO tempatwisata (no, nama, deskripsi, v, v1, gambar) VALUES ('5', 'Ranca Upas', 'Anda tidak akan pernah bosan ketika mengunjungi Ranca Upas. ada beragam spot wisata kece yang siap menyambut. Pengunjung juga bisa menikmati beragam kegiatan outbond seru seperti flying fox,  jembatan goyang,  serta elvis bridge. Bila ingin lebih dekat dengan hewan seperti rusa bisa langsung datang ke penangkaran rusa yang tak jauh dari area kemah.', '-7.1394738', '107.3939461', 'ranca_upas');";
        db.execSQL(sql);

    }

}
