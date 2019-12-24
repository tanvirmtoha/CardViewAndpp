package com.tmtbdpoly.cardviewandpp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.facebook.ads.*;

import com.zolad.zoominimageview.ZoomInImageView;

public class showText extends AppCompatActivity {

    private InterstitialAd interstitialAd;
    private AdView adView;
    String physics = "Physics\n" +
            "<h4>Vector:</h4> Scalar and vector quantities, addition and subtraction of vectors, law of parallelogram,\n" +
            "resolution of vectors.\n" +
            "<h4>Motion and Force:</h4> Displacement, speed and velocity, acceleration. Newton's laws of motion,\n" +
            "static &and kinetic friction, frictional forces. Circular motion, angular velocity and acceleration,\n" +
            "centripetal and centrifugal forces, torque and moment ofinertia. Mass and weight, gravity and\n" +
            "gravitation, Kepler's law, laws of falling bodies,\n" +
            "<h4>Work and Energy:</h4> Work and power, potential and kinetic energy, transformation of work and\n" +
            "energy, work energy theorem.\n" +
            "<h4>Properties of Matter:</h4> Elasticity, different kinds of elasticity, Hook's law, Poisson's ratio,\n" +
            "potential energy for a deforming body. Hydrostatics, Pascal's law, Archimedes principle, specific\n" +
            "gravity. Surface tension, capillarity, angle of contact. Viscosity and co-efficient of viscosity.\n" +
            "</h4>Waves and Oscillation, Sounds:</h4> Simple harmonic motion (SHM), time period, frequency,\n" +
            "potential and kinetic energy of SHM. Simple and compound pendulum. Waves, different types of\n" +
            "wave motion. Sound, infrasonic and ultrasonic sound, velocity of sound, interference of sound,\n" +
            "beats and Doppler effect in sound. Absorption and Reflection of sound from surfaces.\n" +
            "<h4>Heat and thermodynamics:</h4> Heat and temperature, different types of thermometer, heat capacity,\n" +
            "water equivalent, latent heat, calorimetric principle. Co-efficient of real and apparent expansion.\n" +
            "Thermal conductivity, emission and absorption power of radiant heat, Newton's law of cooling.\n" +
            "Specific heat of gas, molar heat capacity. First and Second law of thermodynamics, entropy, heat\n" +
            "engine and its efficiency.\n" +
            "<h4>Light:</h4> Rectilinear propagation of light. Photometry. Laws of reflection and-refraction, reflection\n" +
            "of light from mirrors (plane, concave and convex), refraction of light through prism and lens.\n" +
            "<h4>Atomic Physics:</h4> Electron and photon, X-ray, photoelectric effect. Atom models. Radioactivity\n" +
            "and decay law, half-life and mean-life. Fusion and fission.\n";
    String chemistrystr = "<h2>Chemistry</h2>\n" +
            "<h4>Exothermic and Endothermic reaction:</h4> Different types of chemical reactions.\n" +
            "<h4>Solution:</h4> Different units of concentration of solution and preparation of solution of different\n" +
            "concentration.\n" +
            "<h4>Catalysis and catalyst:</h4> Types, Criterion and Important industrial uses. Introduction to modem\n" +
            "periodic table and classification of elements.\n" +
            "<h4>Gas laws:</h4> Boyle's law, Charle's law and Dalton's law of partial pressure of gases, ideal gas\n" +
            "equation (PV = nRT), STP, NTP.\n" +
            "<h4>Atomic structure:</h4> Fundamental particles of atom, atomic number, mass number, isotopes, isobar,\n" +
            "isotone.\n"+"<h4>Quantum numbers:</h4> Name and significance, Pauli Exclusion Principle, orbit and orbital. Modern\n" +
            "concepts of acid and base, classification of salt according to their chemical properties, basicity of\n" +
            "an acid and acidity of a base.\n" +
            "<h4>pH:</h4> pH scale and its uses, Buffer solutions and their mechanism, acid-base titration, indicators\n" +
            "and their uses.\n" +
            "<h4>Modem concept of oxidation and reduction:</h4> oxidizing agent, reducing agent and oxidation\n" +
            "number/state.\n" +
            "<h4>Chemical bond:</h4> Ionic bond, covalent bond and co-ordinate covalent bond.\n" +
            "<h4>Electrolysis:</h4> Electrical conductor, electrolyte and Faraday's law of electrolysis. Oxides and its\n" +
            "types.\n" +
            "<h4>Hardness:</h4> Hardness of water and its removal techniques (Permutit process, ion exchange resin\n" +
            "process).\n" +
            "<h4>Important ores of Iron, Copper, Aluminum and Zinc:</h4> Manufacturing process of iron and\n" +
            "copper from its ore and Comparison of properties of cast Iron, iron, steel and wrought iron.\n" +
            "<h4>Fundamentals of organic compounds:</h4> Homologous series, Functional groups of organic\n" +
            "compounds.\n" +
            "<h4>Aliphatic hydrocarbon:</h4> Saturated and unsaturated hydrocarbons; General method of preparation\n" +
            "and properties of alkane, alkene and alkyne as well as their IUPAC system of nomenclature.\n" +
            "<h4>Alcohol:</h4> Classification, Enzyme, Fermentation, Power alcohol and Absolute alcohol.";

    String mathstr = "<h2>Mathematics</h2>\n" +
            "<h4>Algebra:</h4> Logarithms, AP & GP, Polynomial, Complex number, Permutation and Combination,\n" +
            "Binomial theorem, Determinants, Matrix, Partial fractions, Exponential Series.\n" +
            "<h4>Trigonometry:</h4> Ratio of associated and compound angles, Transformation formulae, Multiple\n" +
            "angle and Sub-multiple angles, Inverse circular functions, properties and solution of triangles.\n" +
            "<h4>Co-ordinate Geometry:</h4> Co-ordinates of a point, Locus and its equations, Straight lines, Circles\n" +
            "and Conics.\n" +
            "<h4>Differential Calculus:</h4> Functions, Limits, Continuity, Differentiation, Successive\n" +
            "Differentiation with Leibnitz theorern, Partial Differentiation.\n" +
            "<h4>Integral Calculus:</h4> Fundamental integrals, Integration by substitution, Integration by parts,\n" +
            "partial fractions, Definite integrals.";
    String englishstr = "<h2>Humanities & Social Sciences (English)</h2>\n" +
            "<h4>Uses of Tense:</h4> Right form of verbs, correction of errors, subject-verb agreement in sentences,\n" +
            "functional use of all kinds of tense.\n" +
            "<h4>Sentence Structure:</h4> Types of clauses and sentences, changing sentence according to the\n" +
            "direction mentioned in bracket.\n" +
            "<h4>Classification of verbs:</h4> Transitive/intransitive, finite/non-finite.\n" +
            "<h4>Parts of Speech:</h4> Identifying the usage of different types of parts of speech according to their\n" +
            "place and function in a sentence.\n" +
            "<h4>Usage of Suffix and Prefix:</h4> Forms of different words and derivation of words using different\n" +
            "affixes according to the context.\n" +
            "17\n" +
            "<h4>Use of Preposition:</h4> Appropriate use of preposition, use of phrasal prepositions\n" +
            "<h4>Idioms and Phrases:</h4> Usage of Idioms and Phrases in written and verbal communication providing\n" +
            "accurate meaning/ framing meaningful sentences using the idioms and phrases.\n" +
            "<h4>Voice:</h4> Change of voice from active to passive and vice versa.\n" +
            "<h4>Framing question:</h4> Using communicative expression to ask for a thing or to gain any information\n" +
            "or to seek and offer anything from any body as per various social context.\n" +
            "<h4>Determiners:</h4> Appropriate use of determiners before noun.\n" +
            "<h4>English Vocabulary:</h4> Use of contextual vocabulary, synonyms- supplying the appropriate\n" +
            "equivalent/synonyms of the given words, antonyms-supplying the appropriate antonyms/opposite\n" +
            "meaning of the given words, homophones-use/supply words with same sound but different\n" +
            "meaning in context .\n" +
            "<h4>Paragraph:</h4> Writing short composition on a given topic.\n" +
            "<h4>Letter writing:</h4> Different parts and language of a letter, official letter, business letter, formal and\n" +
            "informal format of letter writing .\n" +
            "<h4>Writing reports:</h4> Technical report, news paper report for publication.\n" +
            "<h4>Reading:</h4> Reading comprehension and answer MCQ/ short questions/fill ins/ cloze test/ true-false\n" +
            "based on the text.\n" +
            "<h4>Verbal:</h4> Functional use of main verb, gerund, infinitive, modals and participles.\n" +
            "Translation from Bengali to English and vice versa.\n";


    TextView textView;
    ZoomInImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);


        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);

        interstitialAd = new InterstitialAd(this, "433586950678992_446444629393224");

        interstitialAd.setAdListener(new InterstitialAdListener() {

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }

            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

            }
        });
        // load the ad
        interstitialAd.loadAd();


        //facebook audence ads show
        adView = new AdView(this, "433586950678992_434222627282091", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();



        //hiding the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //actionbar hide
        getSupportActionBar().hide();


        textView = findViewById(R.id.textShowId);

        img = findViewById(R.id.showImgId);


        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){

            String newname= bundle.getString("name");
            showDetails(newname);
        }


    }
    void showDetails(String newname){
        if (newname.equals("joggota")){
            textView.setText("");
            img.setImageResource(R.drawable.joggota);
        }
        if (newname.equals("seat")){
            textView.setText("");
            img.setImageResource(R.drawable.seat);
        }
        if (newname.equals("numberb")){
            textView.setText("");
            img.setImageResource(R.drawable.numberbivajon);
        }
        if (newname.equals("department")){
            textView.setText("");
            img.setImageResource(R.drawable.bivagsomuho);
        }
        if (newname.equals("physics")){
            textView.setText(Html.fromHtml(physics));
        }
        if (newname.equals("chemistry")){
            textView.setText(Html.fromHtml(chemistrystr));
        }
        if (newname.equals("math")){
            textView.setText(Html.fromHtml(mathstr));
        }
        if (newname.equals("english")){
            textView.setText(Html.fromHtml(englishstr));
        }


        if (newname.equals("civil")){
            img.setImageResource(R.drawable.civil);
        }
        if (newname.equals("computer")){
            img.setImageResource(R.drawable.computer);
        }
        if (newname.equals("eee")){
            img.setImageResource(R.drawable.eee);
        }
        if (newname.equals("mechanical")){
            img.setImageResource(R.drawable.mechanical);
        }
        if (newname.equals("textile")){
            img.setImageResource(R.drawable.textile);
        }
        if (newname.equals("architech")){
            img.setImageResource(R.drawable.architechture);
        }
        if (newname.equals("food")){
            img.setImageResource(R.drawable.food);
        }
        if (newname.equals("ipe")){
            img.setImageResource(R.drawable.ipe);
        }
    }


}
