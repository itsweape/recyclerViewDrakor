package com.example.drakorlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Drakor> drakor = new ArrayList<>();
    private DrakorAdapter drakorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        drakorAdapter = new DrakorAdapter(this, drakor);
        recyclerView = findViewById(R.id.rv_drakor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(drakorAdapter);
    }
    //menambahkan data pada tampilan
    private void addData(){
        drakor.add(new Drakor("Extraordinary Attorney Woo", "Drama, Law", "‘Extraordinary Attorney Woo’ menceritakan kisah Woo Young Woo, seorang pengacara genius yang memulai kariernya di Firma Hukum Hanbada yang ternama.Berbeda dari kebanyakan drama seputar dunia legal yang memukau penonton lewat praktik hukum yang kompetitif atau bahkan ekstrem, ‘Extraordinary Attorney Woo’ menawarkan alur cerita yang berbeda. Young-woo merupakan seorang pengacara dengan sindrom spektrum autisme yang harus menghadapi berbagai prasangka di tempat kerjanya. Namun, kecintaannya terhadap hukum dari sejak kecil dan kemampuannya yang spesial, justru membuatnya dapat memecahkan beragam kasus, menangkap detail masalah, serta menemukan celah peraturan yang lolos dari perhatian orang lain."));
        drakor.add(new Drakor("Little Women", "Mistery", "Little women menceritakan soal tiga saudara perempuan yang terlibat dalam kasus yang membuat mereka bertarung melawan keluarga terkaya dan paling berpengaruh di Korea Selatan. Oh In-Joo (Kim Go Eun) adalah kakak perempuan tertua. Dia dibesarkan di lingkungan yang sangat miskin dan dia masih miskin hingga sekarang. Sejak dia masih kecil, In Joo menyadari bahwa uang adalah hal yang paling penting untuk melindungi dirinya dan keluarganya. Mimpinya adalah menjalani kehidupan biasa seperti orang lain. Kemudian, Oh In-Kyung (Nam Ji Hyun) adalah saudara perempuan tengah. Dia adalah reporter yang antusias di sebuah stasiun berita. Dia sekarang mulai menggali kasus misterius yang pertama kali dia hadapi ketika dia pertama kali menjadi reporter Sementara, Oh In-Hye (Park JiHu) adalah anak bungsu dari tiga bersaudara tersebut. Dia adalah seorang siswa di sekolah tinggi seni bergengsi dan memiliki bakat alami untuk melukis. Dia sering merasa cinta kedua kakak perempuannya terlalu besar untuknya."));
        drakor.add(new Drakor("Big Mouth", "Criminal", "Park Chang Ho (Lee Jong-suk) merupakan seorang pengacara yang memiliki tingkat kemenangan sangat kecil. Yakni hanya 10 persen dalam persidangan yang sudah ia lewati. Karena sifatnya yang terkenal banyak bicara, ia mendapat julukan “Big Mouth” alias bermulut besar. Suatu ketika, Ia tidak sengaja terlibat dalam kasus pembunuhan yang mengancam nyawanya. Momen ini terjadi saat ia mendapat tugas menangani kasus elit yang pada akhirnya membuatnya terpaksa mendekam di penjara dengan para pembunuh yang sedang ia selidiki. Sebab, para penyelidik menemukan sejumlah obat terlarang, uang tunai, senjata dan barang bukti lainnya di kantor Chang Ho. Karena penemuan ini, ia pun dituduh sebagai penipu genius bernama Big Mouse."));
    }
}