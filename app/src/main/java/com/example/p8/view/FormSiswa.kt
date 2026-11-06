package com.example.myarsitekturmvvm.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    pilihanJK: List<String>,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
){
    var txtNama by rememberSaveable { mutableStateOf("")}
    var txtAlamat by remember { mutableStateOf("")}
    var txtGender by remember { mutableStateOf("")}
    val listData: MutableList<String> = mutableListOf(txtNama,txtGender,txtAlamat)

    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(title = { Text(stringResource(id = R.string.app_name), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.purple_500))
            )
        }) { isiRuang ->


        }
    }
}