package com.example.assesment2_cheva_androidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assesment2_cheva_androidstudio.ui.theme.Assesment2ChevaAndroidStudioTheme

data class Student(
    val name: String,
    val darikelas: String,
    val nim: Int,
)

val students = listOf(
    Student("Yazid Istiqlal Adhy Fadhillah", "D3IF-48-02", 12345),
    Student("Ahmad Hasan", "D3IF-48-02", 12346),
    Student("Setiadi Agusnawan", "D3IF-48-02", 12347),
    Student("Raguel Sinampar", "D3IF-48-02", 12348),
    Student("Hasan Wijaya", "D3IF-48-02", 12349),
    Student("Hamzah Indraini", "D3IF-48-02", 12350),
    Student("Risky Indrawan", "D3IF-48-03", 12351),
    Student("Lutfi Ramadhan", "D3IF-48-03", 12352),
    Student("Mira Syafitri", "D3IF-48-03", 12353),
    Student("Naufal Pratama", "D3IF-48-03", 12354),
    Student("Dina Amelia", "D3IF-48-04", 12355),
    Student("Reza Putra", "D3IF-48-04", 12356),
    Student("Salsabila Indah", "D3IF-48-04", 12357),
    Student("Arya Nugraha", "D3IF-48-04", 12358),
    Student("Siti Maulida", "D3IF-48-04", 12359),
    Student("Johan Aditya", "D3IF-48-05", 12360),
    Student("Farhan Anugrah", "D3IF-48-05", 12361),
    Student("Rika Handayani", "D3IF-48-05", 12362),
    Student("Hendra Saputra", "D3IF-48-05", 12363),
    Student("Yuni Kartika", "D3IF-48-05", 12364),
    Student("Bagus Pratama", "D3IF-48-06", 12365),
    Student("Fadhil Muhammad", "D3IF-48-06", 12366),
    Student("Ayu Lestari", "D3IF-48-06", 12367),
    Student("Putri Cahyani", "D3IF-48-06", 12368),
    Student("Gilang Ramadhan", "D3IF-48-06", 12369),
    Student("Dewi Anjani", "D3IF-48-07", 12370),
    Student("Rahmat Saputra", "D3IF-48-07", 12371),
    Student("Indra Gunawan", "D3IF-48-07", 12372),
    Student("Bella Susanti", "D3IF-48-07", 12373),
    Student("Adi Pratama", "D3IF-48-07", 12374),
    Student("Lina Wijaya", "D3IF-48-08", 12375),
    Student("Zaki Anwar", "D3IF-48-08", 12376),
    Student("Citra Dewi", "D3IF-48-08", 12377),
    Student("Rio Septian", "D3IF-48-08", 12378),
    Student("Tina Sari", "D3IF-48-08", 12379),
    Student("Faisal Arif", "D3IF-48-09", 12380),
    Student("Nurul Azizah", "D3IF-48-09", 12381),
    Student("Dedi Kurniawan", "D3IF-48-09", 12382),
    Student("Wahyu Hartono", "D3IF-48-09", 12383),
    Student("Rina Ayu", "D3IF-48-09", 12384),
    Student("Budi Santoso", "D3IF-48-10", 12385),
    Student("Siti Nurhaliza", "D3IF-48-10", 12386),
    Student("Eko Prasetyo", "D3IF-48-10", 12387),
    Student("Rini Oktaviani", "D3IF-48-10", 12388),
    Student("Ardi Susanto", "D3IF-48-10", 12389)
)


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assesment2ChevaAndroidStudioTheme {
                Scaffold(modifier = Modifier.fillMaxSize() , topBar = {
                    TopAppBar(
                        modifier = Modifier.padding(top = 5.dp),
                        title = {
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center,
                            ) {
                                Text(text = "Daftar Mahasiswa", style = MaterialTheme.typography.bodyLarge)
                            }
                        },
                        colors= TopAppBarDefaults.mediumTopAppBarColors(
                            containerColor = Color.Transparent,
                            titleContentColor = Color(0xFF11111B),
                        )
                    )
                })
                { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        StudentList(students)
                    }
                }
            }
        }
        }
    }

@Composable
fun StudentCard(students: Student, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFB4BEFE))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
        ) {
            Text(text = "Nama: ${students.name}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Kelas: ${students.darikelas}", style = MaterialTheme.typography.bodySmall)
            Text(text = "NIM: ${students.nim}", style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Composable
fun StudentList(students: List<Student>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(students) { student ->
            StudentCard(
                student,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(5.dp))
            )
        }
    }

}