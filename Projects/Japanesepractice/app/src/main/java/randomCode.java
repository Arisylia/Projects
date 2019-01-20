import android.widget.Switch;

import com.example.pinapple.japanesepractice.R;

/**
 * Created by pinapple on 06/03/2018.
 */

public class randomCode {
    String[][][] monographs = {
            {{"a", "あ", "ア"}, {"i", "い", "イ"}, {"u", "う", "ウ"}, {"e", "え", "エ"}, {"o", "お", "オ"}},
            {{"ka", "か", "カ"}, {"ki", "き", "キ"}, {"ku", "く", "ク"}, {"ke", "け", "ケ"}, {"ko", "こ", "コ"}},
            {{"sa", "さ", "サ"}, {"shi", "し", "シ"}, {"su", "す", "ス"}, {"se", "せ", "セ"}, {"so", "そ", "ソ"}},
            {{"ta", "た", "タ"}, {"chi", "ち", "チ"}, {"tsu", "つ", "ツ"}, {"te", "て", "テ"}, {"to", "と", "ト"}},
            {{"na", "な", "ナ"}, {"ni", "に", "ニ"}, {"nu", "ぬ", "ヌ"}, {"ne", "ね", "ネ"}, {"no", "の", "ノ"}},
            {{"ha", "は", "ハ"}, {"hi", "ひ", "ヒ"}, {"fu", "ふ", "フ"}, {"he", "へ", "ヘ"}, {"ho", "ほ", "ホ"}},
            {{"ma", "ま", "マ"}, {"mi", "み", "ミ"}, {"mu", "む", "ム"}, {"me", "め", "メ"}, {"mo", "も", "モ"}},
            {{"ya", "や", "ヤ"}, {"", "", ""}, {"yu", "ゆ", "ユ"}, {"", "", ""}, {"yo", "よ", "ヨ"}},
            {{"ra", "ら", "ラ"}, {"ri", "り", "リ"}, {"ru", "る", "ル"}, {"re", "れ", "レ"}, {"ro", "ろ", "ロ"}},
            {{"wa", "わ", "ワ"}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"o/wo", "を", "ヲ"}},
            {{"n", "ん", "ン"}}
    };
    // digraphs are in [7][3][3]
    String[][][] digraphs = {
            {{"kya", "きゃ", "キャ"}, {"kyu", "きゅ", "キュ"}, {"kyo", "きょ", "キョ"}},
            {{"sha", "しゃ", "シャ"}, {"shu", "しゅ", "シュ"}, {"sho", "しょ", "ショ"}},
            {{"cha", "ちゃ", "チャ"}, {"chu", "ちゅ", "チュ"}, {"cho", "ちょ", "チョ"}},
            {{"nya", "にゃ", "ニャ"}, {"nyu", "にゅ", "ニュ"}, {"nyo", "にょ", "ニョ"}},
            {{"hya", "ひゃ", "ヒャ"}, {"hyu", "ひゅ", "ヒュ"}, {"hyo", "ひょ", "ヒョ"}},
            {{"mya", "みゃ", "ミャ"}, {"myu", "みゅ", "ミュ"}, {"myo", "みょ", "ミョ"}},
            {{"rya", "りゃ", "リャ"}, {"ryu", "りゅ", "リュ"}, {"ryo", "りょ", "リョ"}}
    };


    // monographs_with_diacritics is in [5][5][3]
    String[][][] monographs_with_diacritics = {
            {{"ga", "が", "ガ"}, {"gi", "ぎ", "ギ"}, {"gu", "ぐ", "グ"}, {"ge", "げ", "ゲ"}, {"go", "ご", "ゴ"}},
            {{"za", "ざ", "ザ"}, {"ji", "じ", "ジ"}, {"zu", "ず", "ズ"}, {"ze", "ぜ", "ゼ"}, {"zo", "ぞ", "ゾ"}},
            {{"da", "だ", "ダ"}, {"ji*", "ぢ", "ヂ"}, {"zu*", "づ", "ヅ"}, {"de", "で", "デ"}, {"do", "ど", "ド"}},
            {{"ba", "ば", "バ"}, {"bi", "び", "ビ"}, {"bu", "ぶ", "ブ"}, {"be", "べ", "ベ"}, {"bo", "ぼ", "ボ"}},
            {{"pa", "ぱ", "パ"}, {"pi", "ぴ", "ピ"}, {"pu", "ぷ", "プ"}, {"pe", "ぺ", "ペ"}, {"po", "ぽ", "ポ"}}
    };
    // digraphs_with_diacritics is in [5][5][3]
    String[][][] digraphs_with_diacritics = {
            {{"gya", "ぎゃ", "ギャ"}, {"gyu", "ぎゅ", "ギュ"}, {"gyo", "ぎょ", "ギョ"}},
            {{"ja", "じゃ", "ジャ"}, {"ju", "じゅ", "ジュ"}, {"jo", "じょ", "ジョ"}},
            {{"ja*", "ぢゃ", "ヂャ"}, {"ju*", "ぢゅ", "ヂュ"}, {"jo*", "ぢょ", "ヂョ"}},
            {{"bya", "びゃ", "ビャ"}, {"byu", "びゅ", "ビュ"}, {"byo", "びょ", "ビョ"}},
            {{"pya", "ぴゃ", "ピャ"}, {"pyu", "ぴゅ", "ピュ"}, {"pyo", "ぴょ", "ピョ"}}
    };
    String[][][][] characterFamilies = {monographs, digraphs, monographs_with_diacritics, digraphs_with_diacritics};
/*

String[] a_hiragana,k_hiragana,s_hiragana,t_hiragana,n_hiragana,h_hiragana
            ,m_hiragana,y_hiragana,r_hiragana,w_hiragana,just_n_hiragana,g_hiragana,z_hiragana
            ,d_hiragana,b_hiragana,p_hiragana, a_katakana,k_katakana,s_katakana,t_katakana,n_katakana,h_katakana
            ,m_katakana,y_katakana,r_katakana,w_katakana,just_n_katakana,g_katakana,z_katakana
            ,d_katakana,b_katakana,p_katakana;

    String[][] kanaArrays = {a_hiragana,k_hiragana,s_hiragana,t_hiragana,n_hiragana,h_hiragana
            ,m_hiragana,y_hiragana,r_hiragana,w_hiragana,just_n_hiragana,g_hiragana,z_hiragana
            ,d_hiragana,b_hiragana,p_hiragana, a_katakana,k_katakana,s_katakana,t_katakana,n_katakana,h_katakana
            ,m_katakana,y_katakana,r_katakana,w_katakana,just_n_katakana,g_katakana,z_katakana
            ,d_katakana,b_katakana,p_katakana};


    String[] a_hiragana_ans,k_hiragana_ans,s_hiragana_ans,t_hiragana_ans,n_hiragana_ans,h_hiragana_ans
            ,m_hiragana_ans,y_hiragana_ans,r_hiragana_ans,w_hiragana_ans,just_n_hiragana_ans,g_hiragana_ans,z_hiragana_ans
            ,d_hiragana_ans,b_hiragana_ans,p_hiragana_ans, a_katakana_ans,k_katakana_ans,s_katakana_ans,t_katakana_ans,n_katakana_ans,h_katakana_ans
            ,m_katakana_ans,y_katakana_ans,r_katakana_ans,w_katakana_ans,just_n_katakana_ans,g_katakana_ans,z_katakana_ans
            ,d_katakana_ans,b_katakana_ans,p_katakana_ans;

    String[][] kanaAnsArrays = {a_hiragana_ans,k_hiragana_ans,s_hiragana_ans,t_hiragana_ans,n_hiragana_ans,h_hiragana_ans
            ,m_hiragana_ans,y_hiragana_ans,r_hiragana_ans,w_hiragana_ans,just_n_hiragana_ans,g_hiragana_ans,z_hiragana_ans
            ,d_hiragana_ans,b_hiragana_ans,p_hiragana_ans, a_katakana_ans,k_katakana_ans,s_katakana_ans,t_katakana_ans,n_katakana_ans,h_katakana_ans
            ,m_katakana_ans,y_katakana_ans,r_katakana_ans,w_katakana_ans,just_n_katakana_ans,g_katakana_ans,z_katakana_ans
            ,d_katakana_ans,b_katakana_ans,p_katakana_ans};

    String[] a_hiragana = res.getStringArray(R.array.a_hiragana);
    String[] k_hiragana = res.getStringArray(R.array.k_hiragana);
    String[] s_hiragana = res.getStringArray(R.array.s_hiragana);
    String[] t_hiragana = res.getStringArray(R.array.t_hiragana);
    String[] n_hiragana = res.getStringArray(R.array.n_hiragana);
    String[] h_hiragana = res.getStringArray(R.array.h_hiragana);
    String[] m_hiragana = res.getStringArray(R.array.m_hiragana);
    String[] y_hiragana = res.getStringArray(R.array.y_hiragana);
    String[] r_hiragana = res.getStringArray(R.array.r_hiragana);
    String[] w_hiragana = res.getStringArray(R.array.w_hiragana);
    String[] just_n_hiragana = res.getStringArray(R.array.just_n_hiragana);
    String[] g_hiragana = res.getStringArray(R.array.g_hiragana);
    String[] z_hiragana = res.getStringArray(R.array.z_hiragana);
    String[] d_hiragana = res.getStringArray(R.array.d_hiragana);
    String[] b_hiragana = res.getStringArray(R.array.b_hiragana);
    String[] p_hiragana = res.getStringArray(R.array.p_hiragana);
    String[] a_katakana = res.getStringArray(R.array.a_katakana);
    String[] k_katakana = res.getStringArray(R.array.k_katakana);
    String[] s_katakana = res.getStringArray(R.array.s_katakana);
    String[] t_katakana = res.getStringArray(R.array.t_katakana);
    String[] n_katakana = res.getStringArray(R.array.n_katakana);
    String[] h_katakana = res.getStringArray(R.array.h_katakana);
    String[] m_katakana = res.getStringArray(R.array.m_katakana);
    String[] y_katakana = res.getStringArray(R.array.y_katakana);
    String[] r_katakana = res.getStringArray(R.array.r_katakana);
    String[] w_katakana = res.getStringArray(R.array.w_katakana);
    String[] just_n_katakana = res.getStringArray(R.array.just_n_katakana);
    String[] g_katakana = res.getStringArray(R.array.g_katakana);
    String[] z_katakana = res.getStringArray(R.array.z_katakana);
    String[] d_katakana = res.getStringArray(R.array.d_katakana);
    String[] b_katakana = res.getStringArray(R.array.b_katakana);
    String[] p_katakana = res.getStringArray(R.array.p_katakana);
    String[][] kanaArrays = {a_hiragana,k_hiragana,s_hiragana,t_hiragana,n_hiragana,h_hiragana
            ,m_hiragana,y_hiragana,r_hiragana,w_hiragana,just_n_hiragana,g_hiragana,z_hiragana
            ,d_hiragana,b_hiragana,p_hiragana, a_katakana,k_katakana,s_katakana,t_katakana,n_katakana,h_katakana
            ,m_katakana,y_katakana,r_katakana,w_katakana,just_n_katakana,g_katakana,z_katakana
            ,d_katakana,b_katakana,p_katakana};

    String[] a_hiragana_ans= res.getStringArray(R.array.a_hiragana_ans);
    String[] k_hiragana_ans= res.getStringArray(R.array.k_hiragana_ans);
    String[] s_hiragana_ans= res.getStringArray(R.array.s_hiragana_ans);
    String[] t_hiragana_ans= res.getStringArray(R.array.t_hiragana_ans);
    String[] n_hiragana_ans= res.getStringArray(R.array.n_hiragana_ans);
    String[] h_hiragana_ans= res.getStringArray(R.array.h_hiragana_ans);
    String[] m_hiragana_ans= res.getStringArray(R.array.m_hiragana_ans);
    String[] y_hiragana_ans= res.getStringArray(R.array.y_hiragana_ans);
    String[] r_hiragana_ans= res.getStringArray(R.array.r_hiragana_ans);
    String[] w_hiragana_ans= res.getStringArray(R.array.w_hiragana_ans);
    String[] just_n_hiragana_ans= res.getStringArray(R.array.just_n_hiragana_ans);
    String[] g_hiragana_ans= res.getStringArray(R.array.g_hiragana_ans);
    String[] z_hiragana_ans= res.getStringArray(R.array.z_hiragana_ans);
    String[] d_hiragana_ans= res.getStringArray(R.array.d_hiragana_ans);
    String[] b_hiragana_ans= res.getStringArray(R.array.b_hiragana_ans);
    String[] p_hiragana_ans= res.getStringArray(R.array.p_hiragana_ans);
    String[] a_katakana_ans= res.getStringArray(R.array.a_katakana_ans);
    String[] k_katakana_ans= res.getStringArray(R.array.k_katakana_ans);
    String[] s_katakana_ans= res.getStringArray(R.array.s_katakana_ans);
    String[] t_katakana_ans= res.getStringArray(R.array.t_katakana_ans);
    String[] n_katakana_ans= res.getStringArray(R.array.n_katakana_ans);
    String[] h_katakana_ans= res.getStringArray(R.array.h_katakana_ans);
    String[] m_katakana_ans= res.getStringArray(R.array.m_katakana_ans);
    String[] y_katakana_ans= res.getStringArray(R.array.y_katakana_ans);
    String[] r_katakana_ans= res.getStringArray(R.array.r_katakana_ans);
    String[] w_katakana_ans= res.getStringArray(R.array.w_katakana_ans);
    String[] just_n_katakana_ans= res.getStringArray(R.array.just_n_katakana_ans);
    String[] g_katakana_ans= res.getStringArray(R.array.g_katakana_ans);
    String[] z_katakana_ans= res.getStringArray(R.array.z_katakana_ans);
    String[] d_katakana_ans= res.getStringArray(R.array.d_katakana_ans);
    String[] b_katakana_ans= res.getStringArray(R.array.b_katakana_ans);
    String[] p_katakana_ans= res.getStringArray(R.array.p_katakana_ans);
    String[][] kanaAnsArrays = {a_hiragana_ans,k_hiragana_ans,s_hiragana_ans,t_hiragana_ans,n_hiragana_ans,h_hiragana_ans
            ,m_hiragana_ans,y_hiragana_ans,r_hiragana_ans,w_hiragana_ans,just_n_hiragana_ans,g_hiragana_ans,z_hiragana_ans
            ,d_hiragana_ans,b_hiragana_ans,p_hiragana_ans, a_katakana_ans,k_katakana_ans,s_katakana_ans,t_katakana_ans,n_katakana_ans,h_katakana_ans
            ,m_katakana_ans,y_katakana_ans,r_katakana_ans,w_katakana_ans,just_n_katakana_ans,g_katakana_ans,z_katakana_ans
            ,d_katakana_ans,b_katakana_ans,p_katakana_ans};

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


Switch aHiraganaSwitch = findViewById(R.id.aHiraganaSwitch);
    Switch kHiraganaSwitch = findViewById(R.id.kHiraganaSwitch);
    Switch sHiraganaSwitch = findViewById(R.id.sHiraganaSwitch);
    Switch tHiraganaSwitch = findViewById(R.id.tHiraganaSwitch);
    Switch nHiraganaSwitch = findViewById(R.id.nHiraganaSwitch);
    Switch hHiraganaSwitch = findViewById(R.id.hHiraganaSwitch);
    Switch mHiraganaSwitch = findViewById(R.id.mHiraganaSwitch);
    Switch yHiraganaSwitch = findViewById(R.id.yHiraganaSwitch);
    Switch rHiraganaSwitch = findViewById(R.id.rHiraganaSwitch);
    Switch wHiraganaSwitch = findViewById(R.id.wHiraganaSwitch);
    Switch just_nHiraganaSwitch = findViewById(R.id.just_nHiraganaSwitch);
    Switch gHiraganaSwitch = findViewById(R.id.gHiraganaSwitch);
    Switch zHiraganaSwitch = findViewById(R.id.zHiraganaSwitch);
    Switch dHiraganaSwitch = findViewById(R.id.dHiraganaSwitch);
    Switch bHiraganaSwitch = findViewById(R.id.bHiraganaSwitch);
    Switch pHiraganaSwitch = findViewById(R.id.pHiraganaSwitch);
    Switch aKatakanaSwitch = findViewById(R.id.aKatakanaSwitch);
    Switch kKatakanaSwitch = findViewById(R.id.kKatakanaSwitch);
    Switch sKatakanaSwitch = findViewById(R.id.sKatakanaSwitch);
    Switch tKatakanaSwitch = findViewById(R.id.tKatakanaSwitch);
    Switch nKatakanaSwitch = findViewById(R.id.nKatakanaSwitch);
    Switch hKatakanaSwitch = findViewById(R.id.hKatakanaSwitch);
    Switch mKatakanaSwitch = findViewById(R.id.mKatakanaSwitch);
    Switch yKatakanaSwitch = findViewById(R.id.yKatakanaSwitch);
    Switch rKatakanaSwitch = findViewById(R.id.rKatakanaSwitch);
    Switch wKatakanaSwitch = findViewById(R.id.wKatakanaSwitch);
    Switch just_nKatakanaSwitch = findViewById(R.id.just_nKatakanaSwitch);
    Switch gKatakanaSwitch = findViewById(R.id.gKatakanaSwitch);
    Switch zKatakanaSwitch = findViewById(R.id.zKatakanaSwitch);
    Switch dKatakanaSwitch = findViewById(R.id.dKatakanaSwitch);
    Switch bKatakanaSwitch = findViewById(R.id.bKatakanaSwitch);
    Switch pKatakanaSwitch = findViewById(R.id.pKatakanaSwitch);
    */
}
