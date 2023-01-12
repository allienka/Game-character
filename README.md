# Game-character


Tee tekstipohjainen ohjelma (eli siinä ei tarvitse olla graafista käyttöliittymää), joka mallintaa pelihahmoa ja tämän taitojen kehitystä. 
Jokainen taito koostuu nimestä ja kyseisen taidon numeerisesta taitotasosta. Suurin mahdollinen taitotaso on 20.
Harjoitellessa hahmo saa satunnaisen määrän kokemuspisteitä (experience points, xp) välillä 100- 250 per harjoituskerta. 500 kokemuspisteestä saa yhden taitopisteen (skill point, sp). Pelaaja voi käyttää taitopisteitä haluamiinsa taitoihin. Yksi taitopiste nostaa taitotasoa yhdellä.
Ohjelmaa käynnistettäessä käyttäjä antaa hahmon nimen. Jos nimeä vastaava tiedosto (esim. Matti => matti.txt) on jo olemassa projektikansiossa, ladataan hahmon tiedot tiedostosta. Muuten luodaan uusi hahmo, jolla on aluksi 0 kokemuspistettä ja 0 taitopistettä.

Ohjelmasi tulee tarjota seuraavat toiminnot

• Hahmon tietojen (nimi, kokemuspisteet, käytettävissä olevat taitopisteet) ja taitoluettelon
tulostaminen.

• Uuden taidon lisääminen. Toista samannimistä taitoa ei voi lisätä.

• Taidon nimen vaihtaminen (kirjoitusvirheiden varalta). Ilmoita käyttäjälle, jos etsittyä taitoa
ei ole olemassa.

• Harjoitteleminen, josta saa kokemuspisteitä. Kun hahmo saa kasaan 500 kokemuspistettä,
hän saa yhden taitopisteen lisää ja kokemuspisteet nollataan (varo ettet nollaa 500 pisteen
yli menevää osaa).

• Taitopisteiden käyttäminen taitoihin. Jos taidon taitotaso on jo 20, siihen ei voi käyttää
enempää pisteitä (taitopiste ei myöskään saa kadota).

• Hahmon tietojen tallentaminen tekstitiedostoon. Esim. ensimmäiselle riville nimi#sp#xp ja
jokainen taito omalle rivilleen taitonimi#taitotaso.

• Hahmon tietojen lukeminen tekstitiedostosta.

Kapseloi toiminnallisuus loogisesti eri luokkiin (esim. Taito-oliot ja Pelihahmo-luokka) ja metodeihin. Main-metodissa kuuluu olla mahdollisimman vähän, esimerkiksi vain suoritettavan toiminnon valinta.
