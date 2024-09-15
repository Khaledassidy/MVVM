package com.example.mvvm.View;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvm.Model.Person;
import com.example.mvvm.R;
import com.example.mvvm.ViewModel.CalculateAgeViewModel;
import com.example.mvvm.databinding.ActivityMainBinding;
/*
l youm la7 nblesh shar7 b she esmo architecture pattern:
exmple:t5ayal eno ne7na badna nebne madene kemle sho l motatlebet le b7aje ela:
2awl sha8le b7aje eno n7aded l maken eno ween bade ebne hay l madene
tene she badna n7aded eno adesh la7 tkoun mase7et hay l madene
telet she la7 n7ded l ameken l ra2seye tab3et hay l madene msln ween 7a tkoun l mostashfeyet,weeen l ameken tarfehye ,weeen l maderes ,ween 7a tkoun l jaweme3,ween 7a tkoun ameken sakan ,ween 7a tkoun l bona ta7teye taba3et l madene
hawde koloun mnetlek 3lyhoun esm architetcture pattern ya3ne l anmat l hykaleye hala2 ne7na heek 7addna haykaleyt l madene bas ne7na ma balsna bel bene2 hawde ta7dedet k2no ne7na 7adadna l arichetuture pattern l anmat l hykaleye ta3et l madene ba3d ma 7dadna l amekn l ra2seye w mase7et l madene w een bada tkoun hay l madene mn balesh nfout bel tasafasel msln
mne5od kel 2ot3a mn l 2ot3a le 7addneha msln mne5od l 2ot3a le heye l mase7a le 7addneha lal mostshfeyet mnblesh n7ded eno adesh 7atkoun mase7et l mostashfa adesh 7akoun 3adad tawabe2  bekl tabe2 kam 8orfe la7koun feha ya3ne mnblesh nebne l ajze2 le 7addenha mn abl hyde l ajze2 l baseta le 3am nebneha mtl 8oraf lal ameken le 7a teskoun feha nees adesh 7akoun mase7ta adesh 7akoun 3adad l abneye lal soken hyde tajze2et l baseta le 3am njaze2a mnetle2 3lyha esm design pattern

mn hawde l amsel:
l arichetucture pattern:byeshra7 l mokwenet w tafe3loha keef ya3ne ya3ne msln ya3ne ne7na 7addna l mase7a w 7addna l amken l mostshfa w amaken tarfeh w l abneye ya3ne hala2 enta bas te5roj mn baytak w badak trou7 3ala amken la tarfeh bt3ref keef badak tetfe3al mn ma7al ma enta seken la ma7al ma enta raye7 la ameken tarfeh  hyde arichetucture pattern byeshra7 l mokwenet w tafe3ola ma3 ba3d
design pattern:byeshra7 l bene2 ya3ne enta 7addt maken l mostshfa bas eno keef 7aykoun lawna kam tabe2 feha  ya3ne heye mokwenet l bene2 hyde mokwenet l bene2 heye design pattern
w momken ne5tesera b 3ebra tenye eno l archetucture pattern  howe 3ebra 3an mo5tat tajrede ama design pattern howe 3ebra 3an bene2 lal mo5tat l tajrede

hala2 lesh btest5dam l arichetecture pattern w design pattern:
-2awln 3ashn ne7sal 3ala code wade7 w mafhoum keef ya3ne ya3ne enta hala2 btbne mashro3 m3yan application w heda l mashro3 byeshte8l ma3ak team mkawan mn 4 asha5as bas enta tektob code yemken yeje wa7ad tene ykamel heda l code  bas yeje heda sha5s lezm ykoun by3ref  lezm ykoun ykoun fe arichtucture pattern w design pattern bshakl eno bas yeje la ykamel yefham sho ana keteb 3ala sho 3am eshte8l yaref eno enta sho 3am t7ewel tebne ya3ne bas tkoun 3am tebne jez2 m3yan mn l application l programmer tene yefhamak eno enta sho 3am t7wel tebne fa heda she kteer mohem eno ykoun l code understandable
-tene sha8le eno ykoun l code reusability ya3ne hala2 3am ebne she m3yan bel application w mmken ba3den 3oz ebne b application tene fa badal ma erja3 ektbo mn 2awl w jdeede berja3 bas bjeeeb l code metl ma howe le ketbo b 8eeer application w 7oto bhay l appplication w hyde sha8le btseer bas tkoun fasel l eshya 3an ba3da ya3ne manak m5le en hyde m3l2a bhyde bshakl eza emto lal code la test3mlo ykoun fe restriction eno ma feek test5dmo lal code ela ma ykoun mawjoud hay sha8le
-telet sha8le eno by3mlk she esmo cleaner code ykoun l code ndeef w 5ale mn aye mashekl w ebel lal maintance ya3ne bas la eje a3mel update lal code ykoun sahl 3lye w maintance ma ye5od wa2t tawel w ykoun l code 5ele mn l exeption hyde no2ta moheme lesh best3mel l design pattern w l arichetecture pattern

arechetecture pattern w anwe3a:
-model view controller(MVC)
-model view presenter(MVP)
-model view view model(MVVM)
-MVI heda arichetecture jdede


design pattern byen2esem la 3 anwa3:
-creational pattern(Builder,singleton,dependency injection,factory)
-structure pattern(Adapter,Facade,Decerator)
-behavoral pattern(Observer,State,Command)

tab3an kel mostla7 mn haw keloun elo dars 5as

hala hawde keloun best5dmo b mahro3 wa7ad la2 mesh darore:
enta momken test5dem arichetecure wa7ad msln MVC w te5od mn design pattern msln Bulider,Facade,Stet,observer w tebne mashro3 mesh darore tkoun btest5dem kel she b mashro3 wa7ad bas enta lezm ta3refoun koloun eno aymta test5dem hal she w weeen test5dema


hala2 l archetecture patter:
howe be2om b ta2sem l mahem l mo5telefe bel application la mokwenet most2elel b7ad zeta w heda she beshel 3mlyet ta3del w l update lal appliction
w b5le l maintibility ashal mn 5ell tanzem l code l2no kel ma keen l code aktr mnazam kenet l maintibility ashal
w btshel l archetectue pattern 2e3edet este5dem l mokwenet b maken tene 2aw b application tene ya3ne reusibility

hala2 l MVVM:
mvvm howe arichetucture pattern aktr she mashhour be2om b fasl l mokwenet l appliction la 3 mokwenet ra2seye sho houne l mokwenet:

Model:ma3neto namozaj hay 3ebra 3an taba2a mas2ole 3an edaret l data w l mante2 l 5as bel application heda jez2 bte3emal ma3 data ema iza keen mn api 2aw mn databse local room 2aw sql bekoun b2lbo kel she 5aso bel databse w enshe2a w columns ya3ne howe byhtam bel data tab3 l application ya3ne kel l data taba3et l application mawjoude bel model
view: ma3neto l 3ard 3ebra 3an wejha lal user ya3ne activity 2aw fragemnt b2lba kel she beshofo l most5dem le heye bt3rod feha l data howe heda byehtam bel 3anaser le btshofa ya3ne bel user interface howe activity 2aw fragmnet ya3ne howe 7ala2et wasl been l baynet w been l user interface keef bseer heda tafe3oul l user by3mel event m3yan mn l view 3ala l viewmodel insert msln fa hy l event btenrasal mn l view lal view model l viewmodel byersel heda l event lal model la databse  bhay tare2a bseer ta8yer bel databse w byerja3 heda ta8yer lal viewmodel telk2eyan mesh b2ede bas hala2 ma fe sehm mn l view model lal view ya3ne ma fe tawasoul mobesher been l viewmodel w l view l2no houn lama yseer ta8yer b databse 2aw b data ta3et l app  w yseer e3det heda ta8yer lal viewmodel l view mala7 yrou7 yetlbo la heda ta8yer ela eza keen jowet l viewmodel she esmo live data 3an tare2 live data la7 ytem est3lem l view 3an kel ta8yer 3am yseer de5el l baynet  ya3ne l view mesh 7a yotlob request mn viewmodel la yredelo data laken by3mel l view observe lal viewmodel ya3ne l view la7 yra2eb l viewmodel w be mojarad ma yseer ta8yer de5el l  viewmodel la7 ytem 2e3a2o lal view by deffult mndoun ma yetlbo l view hay no2ta jawhreye bemyez l vewmodel 3an be2e l eshya metl l preseneter l far2 tene eno la7 ykoun 3ana taba2 tenye been l viewmodel w l model esma repository  ya3ne l viewmodel ma be5teb mobeshratan l model laken be5teb l model 3an tare2 taba2 tenye esma repository l repository howe le 7aykoun 7ala2et wasl been l model w l viewmodel ya3ne taba2at ra2seye heye 3 l view ,viewmodel w model laken btem wad3 taba2a senweye been l model w l viewmodel btetsama repository
viewmodel:ma3neto 3ard l namozaj howe 3ebra 3an waset been l view w l model byorbout l data mn l model le b2lbo data w bejheza la y2om brda bel view w bekoun mas2l 3an l cofigration change le momken tseer

le bseer eno l view btetlob data mn l view model l viewmodel btotlob data mn l model fa l model btjeeb data bteb3ta lal viewmodel w l view model bteb3ta lal view w l viewmodel heye bt5zen data b2lb livedata fa bas yseer ta8yer 3al liuve data te8re btrje3 data lal view mn 5elel l observer l2no btkoun l activity 3am ta3mel observe 3ala l livedata
bas fe 2 senario bel nsebe lal livedata:
eza kenet 3am tet3mal ma3 data takledeye mesh databse fa houn le b5zen data bel live data howe l viewmodel mn 5elel l set() w bas l activity 3am tra2eb ta8yer live data houn l acivity 3am tr2eb l method le mawjoud bel viewmodel le btrje3 live data fa fe method std3neyha b2lba set() 8ayret livedata fa de8re btrja3 vimodel btb3ta data lal activity
ama houn l activity 3am tr2eb method le brje3 live data bel viewmodel fa enta bas ro7t 3mlt insert std3et method mn l view model la ta3mel insert fa ra7et hay l method std3et method le bel repostory w method le bel respository std3e method le doa w 3mlet insert la data fa hala2 room shef eno fe ta8yer la data fa ra7 8ayar live data internally ya3ne k2no 3mel set() fa ta8yer hay livedata 3mlet reflect 3ala live data le bel repsotory w ta8yer l live data bel repository 3melet ta8yer 3ala live data bel viewmodel fa l activity 3am ta3mel observe 3a hay l viewmodel fa ra7 viewmodel 3emel notify lal activiy w 2ala live data t8ayret le 3am ta3mela observe fa 5ode hay live data l jdede w 3adle l ui taba3ek fa houn kolo sar by deffult 2ama fo2 sar yadaweyn ne7na 3mlna ta8yer lal live data mn 5elel method set()


ma3neto l 3ard 3ebra 3an wejha lal user ya3ne activity 2aw fragemnt b2lba kel she beshofo l most5dem le heye bt3rod feha l data howe heda byehtam bel 3anaser le btshofa ya3ne bel user interface howe activity 2aw fragmnet ya3ne howe 7ala2et wasl been l baynet w been l user interface keef bseer heda tafe3oul l user by3mel event m3yan mn l view 3ala l viewmodel insert msln fa hy l event btenrasal mn l view lal view model l viewmodel byersel heda l event lal model la databse  bhay tare2a bseer ta8yer bel databse w byerja3 heda ta8yer lal viewmodel telk2eyan mesh b2ede bas hala2 ma fe sehm mn l view model lal view ya3ne ma fe tawasoul mobesher been l viewmodel w l view l2no houn lama yseer ta8yer b databse 2aw b data ta3et l app  w yseer e3det heda ta8yer lal viewmodel l view mala7 yrou7 yetlbo la heda ta8yer ela eza keen jowet l viewmodel she esmo live data 3an tare2 live data la7 ytem est3lem l view 3an kel ta8yer 3am yseer de5el l baynet  ya3ne l view mesh 7a yotlob request mn viewmodel la yredelo data laken by3mel l view observe lal viewmodel ya3ne l view la7 yra2eb l viewmodel w be mojarad ma yseer ta8yer de5el l  viewmodel la7 ytem 2e3a2o lal view by deffult mndoun ma yetlbo l view hay no2ta jawhreye bemyez l vewmodel 3an be2e l eshya metl l preseneter l far2 tene eno la7 ykoun 3ana taba2 tenye been l viewmodel w l model esma repository  ya3ne l viewmodel ma be5teb mobeshratan l model laken be5teb l model 3an tare2 taba2 tenye esma repository l repository howe le 7aykoun 7ala2et wasl been l model w l viewmodel ya3ne taba2at ra2seye heye 3 l view ,viewmodel w model laken btem wad3 taba2a senweye been l model w l viewmodel btetsama repository:

l mvvm fena ne3ber 3lee mn 5elel heda l exmple:
3teber badna na3mel robot byet7arak byemshe by3mel 7araket ok
model howe 3ebra 3an l brain taba3 l robot le b2lbo mawjoud m3raf kel task metl eno yesmhe yor2os ya3mel kel she 7araket bas hawde ma byetaba2o law7do hawde byetba2o mn 5elel instruction ya3ne l model 3ande howe list of tasks bye2dar ya3meloun l robot
view howe 3ebra 3an remote controle menst3mlo la na3ml interact ma3 robot 3ana b2lbo button for walk button for dance button for wave  bas tekbous 3ala button mn haw msln l wave button tell the robot what to do bhay l exmple howe wave
viewmodel howe 3ebra 3an translator been rorbot bran and remote controle ya3ne bas tekbous 3ala button m3yan mn remote controle hayde byen3mal tranlsate w btente2l lal model 3ashn ynafez 7arake mo3ayne ya3ne howe bas nekbous 3ala buttton bel remote hayde l action btetrjm la she m3yan command byefhama l robot w btenresel lal 3a2lo lala robot w bt2olo nafzle hyde l action
exmple iza kabsana 3ala wave button bel remote controle l viewmodel btrjem hay l kabse lal rebote controle w b2olo bafez hay l 7arake le heye wave make wave
ya3ne kabsana 3ala remote controle wave button bte5oda l viewmodel w btersel l viewmodel message lal model le howe 3a2l l robot w bt2olo please wave

ya3ne l mvvvm btes3dna controle 3ala l application mn 5elel seprate l brain le howe l model le howe data w by3mel seprate lal remote controle le howe l activity w kamen seprate l translater le howe l viewmodel hay separation btsd3na to manage l application

l mvvm heye template lal client application archetecture bt3mel serate lala application le3na l 3 part kel part mas2ol 3ala she m3yan model,view,viewmodel
howe byefsel l data presentation ya3ne l l user interface le btreoud data 3ana data nafsa btefsouloun 3an ba3d kel wa7de ma 5asa b tene

ya3ne l model b2lba kel she data kel she 5aso bel databse sawe2 keeen m api 2aw local databse by3mel encapsulate la data ta3et l application mtl l user information,data retrive from web service ma bekoun fe b2lba wala code 5aso bel user interface 2aw keef data badna ten3ered 3ebra 3an database class w entity mn 5elela bt3mel structure lal data
l view hyde mn 5elela mnetwasal ma3 l viewmodel lal action le momken ya3mela l user hyde l layer observe viewmodel w ma bekoun b2lba aye code 5aso bel logic taba3 l appliction heye 3bra 3ana activity bya3mel action l user mn 5ela w mn 5elel hayde l action mnetwasal ma3 l viewmodel w mne2dar mn 5elela na3ml observe lal viewmodel w heye mas2ole bas 3an l presentation data to user w trigger l action le momken ya3mela l user heye mas2ole 3an kel she beshofo l user w by3mel ma3o interact heye l user interafce b2lba button recycle view ...etc
l viewmodel  heye 3ebra 3an link 2aw wasel been l view w l model b2lab kel logic  manage data le bada ten3arad w bteb3at data le bada ten3arad lal view la7ala mndoun aye requst mn l view ya3ne heye l viewmodel ma btetwasal ma3 l view ya3ne b2lb l view ne7na ma mneb3at requst lal viewmodel eno badna hay data la2 l view observe ber2eb l viewmodel w beshof data le 3am tet8ayr feha mn 5elel live data le mawjoude b2lb l viewmodel w mn5elel l viewmodel ne7na mnetwasal ma3 l model la na3ml aye action 3ala l model bas mesh bshakl mobesher mn 5elel kamen waset baynon le howe l repostory w heda l class kamen bya3mel manage la aye confiration momken l view yseer 3lyha metl l rotation


MVVM:
View-->viewmodel-->repository->model
       livedata


mo5atat lal view viewmodel:

mn blesh bel activity 2aw frgemnt le bemsel l view ba3den mn activity 2aw fragemnt byetlob mn l viewmodel w l viewmodel byotlob mn repository repository momken ykoun naw3en 5eyaren ya ema bekoun  ya ema btkoun data mawjoude be server bel remote metl firebase ,api ya3ne databse 5arejeye ,2aw btkoun l viewmodel de5leye metl l room btkoun databse de5leye
heda l aktr este5dem arichetecture pattern lesh l2no by3tek tarteb akatr lal application l2no houn ne7na 3am nefsel been l userinterface w l databse w heda she be2lel l taklefet l maintainbility w beshel eno neshte8l ka team metl msln wa7ad yestelm l model wa7ad yestelm l viewmodel wala yesteml view ya3ne howe heek faale l data 3an l user interface ya3ne mesh metl ma kona na3mel eno na3mel query la data base mn l activity 3ala l databse la2 houn enta btestd3e method w heye la7ala btjeblak databse w bt7otlak yeha enta 3leek bas ta3mel populate la data ya3ne btjeek data mn bara 3leek tbeha bas 2aw iza badak ta3mel insert bas btst3mel method bel viewmodel w howe la7alo berou7 by3mel insert bas houn eno enta mesh kel mara badak teje 3al activity badak ta3mel objet mn l databse w ta3mlinsert 2aw mesh kel mara enta bas t2olob shshe badak terja3 ta3mel objet mn databse w yerja3 yejblak data 2aw mesh kel mara badak ta3mel requst la mn databse la yejblak data la2 houn howe la7alo bas yshof ta8yer bjeeb data w enta 3leek bas t7ota b view ya3ne enta b2lb l view ya3ne houn kolo mafsoul 3an tene ya3ne keen law badak data terja3 3ashn t7ota b receycle view keeen tsstd3e Databse.getintance,getallemployee() hala2 batalt ta3mel heek sar 3andak observer heye la7al btjblk data bala ma enta testd3eha w bel nesbe lal insert enta 3am testd3e method bas 3am ta3teha paramter bas heye la7ala 3am trou7 ta3mel insert b worker thread ya3ne enta law ma fasltoun keeen kel mara badak ta3mel insert badak trou7 yta3mel thread jdeed ma belak iza keen badak ta3mel 5 insert ma3 ba3d badak ta3mel 5 thread heda she 8alat bhay tare2a enta fasel kel she 3an ba3do

Activity|fragemnt
       |
       |
    View model
    livedata
        |
        |
    Respoitory
        |
        |
 _______|__________________
 |                         |
 |                         |
 |                         |
 Model(Room)         Remote data source(Retrofit)api
 |                          |
 |                          |
 |                          |
 SQLIte                  webservice

exmple badna ne7sob 3omr sha5s ntab2o mn 5elel l mvvvm
bade 2a3ml 4 packages:
package model
package repostory
package viewmodel
package howe l view

fa houn le sar eno 3mlt model fe b2lbo name w l age w 3mlt interface bel reposotry package bye5od name w age  w berje3 muable livedata
ba3den bel repostory 3mlt implemnt la heda l imferface w 7asbt  age w jebt name w jebt data mn l model w 3tyto l age w name w rj3t hay data b mutable live data ok fa houn l repository heye le 3am tetwasal ma3 l model
w ba3den 3mlt viewmodel b2lbo function btrkje3 mutable live data w btstd3e method l repsotory w bel main activity 7atet observe 3alal funtion le brje3 live data
fa hala2 ana bas ekbous 3ala l button btrou7 bestd3e method l bel viewmodel w viewmodel btrou7 btsd3e l method le bel repsotory w l repsotory bteytwasal ma3 ma3 l model b sayev data w be3del 3ala l live data fa bas hayde live data tet3dal heda ta3del kmen byetba2a 3ala livedata le mawjoude bel viewmodel fa l activity 3am ta3ml observe 3ala hyde live data btshof eno sar fe ta3del 3alyha fa l viewmodel bt3ml notify lala activity w bt2ola eno sar fe ta3del 3ala live data w btb3tla e5er live data 3anda fa heek tab2na mafhoun l mvvvm faslna l logic w l data 3an l user interface


l mvvvm btest5dam akatr bel project l m32ade w b7aje la ta7deset kteer bel application mnest5deml mvvm





exmple tene 3ande activity bada te3roud esm b textview bas hal mara 7a nest3mel l mutable live data na3ml 3lyha observe





 */











public class MainActivity extends AppCompatActivity {
    CalculateAgeViewModel calculateAgeViewModel;
    ActivityMainBinding binding;
    String name,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        calculateAgeViewModel= new ViewModelProvider(this).get(CalculateAgeViewModel.class);

        binding.claculate.setOnClickListener(v->{
            name=binding.name.getText().toString();
            age=binding.age.getText().toString();

            calculateAgeViewModel.calculateAge(name,age).observe(this, new Observer<Person>() {
                @Override
                public void onChanged(Person person) {
                    binding.answer.setText(String.valueOf(person.getAge()));
                }
            });
        });





    }
}