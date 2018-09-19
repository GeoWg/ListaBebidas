package com.example.george.listabebidas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int drinkId = 3;
        Intent it = getIntent();
        String[] drinks = new String[]{"Batida de sonho de valsa", "Drink dos deuses", "Quentão"};
        String[] ingredients = new String[]{"3 Bombons de sonho de valsa \n" +
                                                "1 Lata de leite condensado \n" +
                                                "1/2 garrafa de pinga \n" +
                                                "1 latinha de guaraná",
                                            "1 Vidro (100 ml) de leite de coco \n" +
                                                "1 copo (100 ml) de suco de maracujá \n" +
                                                "1 copo (100 ml) de groselha \n" +
                                                "Cerca de uma lata de leite condensado \n" +
                                                "1 copo (100 ml) de cachaça \n" +
                                                    "Gelo picado",
                                                "1 Garrafa de cachaça 600ml \n" +
                                                "600 ml de água \n" +
                                                "1/2 kg de açucar \n" +
                                                "Cascas de 2 laranja \n"+
                                                "1 Casca de limão \n" +
                                                "50 g de gengibre em pedacinhos \n" +
                                                "Cravo da india a gosto \n" +
                                                "Canela de pau a gosto \n" +
                                                        "1 Maça cortada em pedaços"};
        String[] preparo = new String[]{"1. Bater tudo no liquidificador,ficando os chocolates crocantes por cima \n" +
                "2. Servir gelado",
                "1.Bater os 5 primeiros ingredientes no liquidificador e acrescentar o gelo na hora de servir",
                "1. Colocar em uma panela grande o açucar, as cascas de laranja o limão o gengibre, o cravo e a canela \n" +
                        "2. Quando o açucar estiver derretendo colocar a cachaça e agua, deixando cozinhar por 20 a 25m em fogo medio \n" +
                        "3. Filtre, e após coloque a maçã picadinha \n" +
                        "4. manter no fogo, após o preparo"};
        EditText drinkName = (EditText)findViewById(R.id.drinkName);
        EditText ingBox = (EditText)findViewById(R.id.ingEditText);
        EditText prepBox = (EditText)findViewById(R.id.prepET);

        if(it != null){
            drinkId = it.getIntExtra("drinkId", 3);
        }

        if (drinkId == 3) {
            drinkName.setText("");
            ingBox.setText("");
            prepBox.setText("");
            Toast.makeText(this, "Drink não encontrado", Toast.LENGTH_SHORT).show();
        } else {
            drinkName.setText(drinks[drinkId]);
            ingBox.setText(ingredients[drinkId]);
            prepBox.setText(preparo[drinkId]);
        }
    }
}
