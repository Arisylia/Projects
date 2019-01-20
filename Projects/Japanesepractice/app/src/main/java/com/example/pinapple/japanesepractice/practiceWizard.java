package com.example.pinapple.japanesepractice;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class practiceWizard extends AppCompatActivity {
    //String[] testableSet = new String[];
    Random random = new Random();

    List<String> chosenSet;
    List<String> chosenSetAns;

    TextView questionBox;

    String[] a_hiragana,k_hiragana,s_hiragana,t_hiragana,n_hiragana,h_hiragana
            ,m_hiragana,y_hiragana,r_hiragana,w_hiragana,just_n_hiragana,g_hiragana,z_hiragana
            ,d_hiragana,b_hiragana,p_hiragana, a_katakana,k_katakana,s_katakana,t_katakana,n_katakana,h_katakana
            ,m_katakana,y_katakana,r_katakana,w_katakana,just_n_katakana,g_katakana,z_katakana
            ,d_katakana,b_katakana,p_katakana;

    String[] a_hiragana_ans,k_hiragana_ans,s_hiragana_ans,t_hiragana_ans,n_hiragana_ans,h_hiragana_ans
            ,m_hiragana_ans,y_hiragana_ans,r_hiragana_ans,w_hiragana_ans,just_n_hiragana_ans,g_hiragana_ans,z_hiragana_ans
            ,d_hiragana_ans,b_hiragana_ans,p_hiragana_ans, a_katakana_ans,k_katakana_ans,s_katakana_ans,t_katakana_ans,n_katakana_ans,h_katakana_ans
            ,m_katakana_ans,y_katakana_ans,r_katakana_ans,w_katakana_ans,just_n_katakana_ans,g_katakana_ans,z_katakana_ans
            ,d_katakana_ans,b_katakana_ans,p_katakana_ans;
    
    EditText userAns;
    String chosenQuestion;
    String chosenQuestionAns;
    TextView score;
    boolean firstTry = true;
    int correctCount = 0;
    int totalCount = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_wizard);
        //load the characters
        Resources res = getResources();
        a_hiragana = res.getStringArray(R.array.a_hiragana);
        k_hiragana = res.getStringArray(R.array.k_hiragana);
        s_hiragana = res.getStringArray(R.array.s_hiragana);
        t_hiragana = res.getStringArray(R.array.t_hiragana);
        n_hiragana = res.getStringArray(R.array.n_hiragana);
        h_hiragana = res.getStringArray(R.array.h_hiragana);
        m_hiragana = res.getStringArray(R.array.m_hiragana);
        y_hiragana = res.getStringArray(R.array.y_hiragana);
        r_hiragana = res.getStringArray(R.array.r_hiragana);
        w_hiragana = res.getStringArray(R.array.w_hiragana);
        just_n_hiragana = res.getStringArray(R.array.just_n_hiragana);
        g_hiragana = res.getStringArray(R.array.g_hiragana);
        z_hiragana = res.getStringArray(R.array.z_hiragana);
        d_hiragana = res.getStringArray(R.array.d_hiragana);
        b_hiragana = res.getStringArray(R.array.b_hiragana);
        p_hiragana = res.getStringArray(R.array.p_hiragana);
        a_katakana = res.getStringArray(R.array.a_katakana);
        k_katakana = res.getStringArray(R.array.k_katakana);
        s_katakana = res.getStringArray(R.array.s_katakana);
        t_katakana = res.getStringArray(R.array.t_katakana);
        n_katakana = res.getStringArray(R.array.n_katakana);
        h_katakana = res.getStringArray(R.array.h_katakana);
        m_katakana = res.getStringArray(R.array.m_katakana);
        y_katakana = res.getStringArray(R.array.y_katakana);
        r_katakana = res.getStringArray(R.array.r_katakana);
        w_katakana = res.getStringArray(R.array.w_katakana);
        just_n_katakana = res.getStringArray(R.array.just_n_katakana);
        g_katakana = res.getStringArray(R.array.g_katakana);
        z_katakana = res.getStringArray(R.array.z_katakana);
        d_katakana = res.getStringArray(R.array.d_katakana);
        b_katakana = res.getStringArray(R.array.b_katakana);
        p_katakana = res.getStringArray(R.array.p_katakana);


        String[][] kanaArrays = {a_hiragana,k_hiragana,s_hiragana,t_hiragana,n_hiragana,h_hiragana
                ,m_hiragana,y_hiragana,r_hiragana,w_hiragana,just_n_hiragana,g_hiragana,z_hiragana
                ,d_hiragana,b_hiragana,p_hiragana, a_katakana,k_katakana,s_katakana,t_katakana,n_katakana,h_katakana
                ,m_katakana,y_katakana,r_katakana,w_katakana,just_n_katakana,g_katakana,z_katakana
                ,d_katakana,b_katakana,p_katakana};

        a_hiragana_ans = res.getStringArray(R.array.a_hiragana_ans);
        k_hiragana_ans = res.getStringArray(R.array.k_hiragana_ans);
        s_hiragana_ans = res.getStringArray(R.array.s_hiragana_ans);
        t_hiragana_ans = res.getStringArray(R.array.t_hiragana_ans);
        n_hiragana_ans = res.getStringArray(R.array.n_hiragana_ans);
        h_hiragana_ans = res.getStringArray(R.array.h_hiragana_ans);
        m_hiragana_ans = res.getStringArray(R.array.m_hiragana_ans);
        y_hiragana_ans = res.getStringArray(R.array.y_hiragana_ans);
        r_hiragana_ans = res.getStringArray(R.array.r_hiragana_ans);
        w_hiragana_ans = res.getStringArray(R.array.w_hiragana_ans);
        just_n_hiragana_ans = res.getStringArray(R.array.just_n_hiragana_ans);
        g_hiragana_ans = res.getStringArray(R.array.g_hiragana_ans);
        z_hiragana_ans = res.getStringArray(R.array.z_hiragana_ans);
        d_hiragana_ans = res.getStringArray(R.array.d_hiragana_ans);
        b_hiragana_ans = res.getStringArray(R.array.b_hiragana_ans);
        p_hiragana_ans = res.getStringArray(R.array.p_hiragana_ans);
        a_katakana_ans = res.getStringArray(R.array.a_katakana_ans);
        k_katakana_ans = res.getStringArray(R.array.k_katakana_ans);
        s_katakana_ans = res.getStringArray(R.array.s_katakana_ans);
        t_katakana_ans = res.getStringArray(R.array.t_katakana_ans);
        n_katakana_ans = res.getStringArray(R.array.n_katakana_ans);
        h_katakana_ans = res.getStringArray(R.array.h_katakana_ans);
        m_katakana_ans = res.getStringArray(R.array.m_katakana_ans);
        y_katakana_ans = res.getStringArray(R.array.y_katakana_ans);
        r_katakana_ans = res.getStringArray(R.array.r_katakana_ans);
        w_katakana_ans = res.getStringArray(R.array.w_katakana_ans);
        just_n_katakana_ans = res.getStringArray(R.array.just_n_katakana_ans);
        g_katakana_ans = res.getStringArray(R.array.g_katakana_ans);
        z_katakana_ans = res.getStringArray(R.array.z_katakana_ans);
        d_katakana_ans = res.getStringArray(R.array.d_katakana_ans);
        b_katakana_ans = res.getStringArray(R.array.b_katakana_ans);
        p_katakana_ans = res.getStringArray(R.array.p_katakana_ans);

        String[][] kanaAnsArrays = {a_hiragana_ans,k_hiragana_ans,s_hiragana_ans,t_hiragana_ans,n_hiragana_ans,h_hiragana_ans
                ,m_hiragana_ans,y_hiragana_ans,r_hiragana_ans,w_hiragana_ans,just_n_hiragana_ans,g_hiragana_ans,z_hiragana_ans
                ,d_hiragana_ans,b_hiragana_ans,p_hiragana_ans, a_katakana_ans,k_katakana_ans,s_katakana_ans,t_katakana_ans,n_katakana_ans,h_katakana_ans
                ,m_katakana_ans,y_katakana_ans,r_katakana_ans,w_katakana_ans,just_n_katakana_ans,g_katakana_ans,z_katakana_ans
                ,d_katakana_ans,b_katakana_ans,p_katakana_ans};

        chosenQuestion = "a";

        EditText userAns = findViewById(R.id.user_ans);
        TextView questionBox = findViewById(R.id.textView);
        TextView score = findViewById(R.id.grade);
        List<String> chosenSet = new ArrayList<>();
        List<String> chosenSetAns = new ArrayList<>();

        for(int i = 0; i < MainActivity.testKanaFam.length-1; i++){
            if(MainActivity.testKanaFam[i].isChecked()){
                for(int j = 0; j < kanaArrays[i].length; j++){
                    chosenSet.add(kanaArrays[i][j]);
                    chosenSetAns.add(kanaAnsArrays[i][j]);
                }
            }
        }

        chooseQuestion(chosenSet, chosenSetAns);
        userAns.addTextChangedListener(answerWatcher);

        //String chosenQuestion = chooseQuestion(chosenSet, chosenSetAns, questionBox);



    }
    private final TextWatcher answerWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            if(s.length() == chosenQuestion.length()){
                if(s.toString().equals(chosenQuestion) && firstTry == true){
                    update();
                    userAns.setText("");
                }
                else if(s.toString().equals(chosenQuestion) == false && firstTry == true){
                    firstTry = false;
                }
                else if(s.toString().equals(chosenQuestion) == true && firstTry == false){
                    update();
                    userAns.setText("");
                    firstTry = true;
                }
            }
            /*
            if(s.length() == chosenQuestion.length()){
                if(s.toString().equals(chosenQuestion)){
                    correctCount++;
                    totalCount++;

                    chooseQuestion(chosenSet, chosenSetAns, questionBox);
                    userAns.setText("");
                }
                else if(!s.equals(chosenQuestion)){
                    firstTry = false;
                }

            }
            */
        }
    };
    private void chooseQuestion(List<String> kanaList, List<String> kanaAnsList){
        int randomInt = random.nextInt(kanaList.size()-1);
        chosenQuestion = kanaList.get(randomInt);
        chosenQuestionAns = kanaAnsList.get(randomInt);
    }
    //maybe use ints instead of boolean to avoid if statement?

    private void update(){
        chooseQuestion();
        questionBox.setText(chosenQuestion);
        if(firstTry){
            correctCount++;
            totalCount++;
        } else{
            totalCount++;
        }
        score.setText(correctCount + "/" + totalCount);
    }



}
