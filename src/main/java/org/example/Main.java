import org.example.Investigatore;
import org.example.Sospettato;
import org.example.Vittima;

void main() {
        Investigatore i1 = new Investigatore("Detective Harry Hansen, Distintivo #124");
        Investigatore i2 = new Investigatore("Detective Finis Brown, Distintivo #78");

        Vittima v1 = new Vittima("Elizabeth Short", "Gli investigatori giungono sul posto alle ore 10:25 AM. La giornata si presenta parzialmente nuvolosa, il terreno è arido. Il corpo della vittima giace a circa 20 centimetri dal bordo del marciapiede, adagiato sull'erba corta dell'appezzamento vuoto.\n"
                + "\tLa scena si presenta con caratteristiche di eccezionale e sinistra anomalia:\n"
                + "\t• Sezionamento totale: Il cadavere è stato completamente tagliato in due metà nette all'altezza della vita (emicorpo superiore ed emicorpo inferiore separati), mediante un'incisione chirurgica precisa eseguita tra la seconda e la terza vertebra lombare.\n"
                + "\t• Posizionamento rituale: Le due parti del corpo sono state disposte in modo deliberato e artificiale. Gli arti inferiori sono divaricati a formare una \"V\". Le braccia della vittima sono piegate verso l'alto, i gomiti ad angolo retto, paralleli alla testa, in una posa che evoca un manichino da esposizione.\n"
                + "\t• Assenza di sangue: Nonostante la gravità delle mutilazioni, non vi è alcuna traccia di sangue sul terreno circostante, né sulle ferite stesse. Il corpo appare interamente lavato, drenato del proprio liquido ematico e ripulito prima del posizionamento sul terreno. Il colore della cute è di un bianco vitreo, quasi marmoreo.\n"
                + "\n\tL'esame visivo ravvicinato del volto e del tronco rivela dettagli altamente inquietanti, indicativi di un sadismo mirato e di una personalità fortemente disturbata:\n"
                + "\t• Il \"Sorriso di Glasgow\": Sul volto della vittima sono stati praticati due tagli profondi che partono dagli angoli della bocca e si estendono fino alle orecchie (sfregio noto come Glasgow smile), conferendo al volto una permanente e grottesca espressione di sorriso.\n"
                + "\t• Segni di legatura: Si riscontrano profondi solchi da corda attorno ai polsi, alle caviglie e al collo, compatibili con un prolungato confinamento in stato di sospensione o immobilizzazione forzata prima del decesso.\n"
                + "\t• Mutilazioni localizzate: Si evidenziano asportazioni di porzioni di tessuto cutaneo ed ecchimosi multiple sul cranio, segno di ripetuti traumi contusivi al volto.\n");

        Sospettato s1 = new Sospettato("dottor Walter Bayley", "Nonostante gli elementi sinistri e fortemente indiziari emersi dalle trascrizioni e dai reperti, l'Ufficio del Procuratore Distrettuale stabilisce che le frasi intercettate, pur se inquietanti, non costituiscono una confessione formale utilizzabile in tribunale senza un riscontro materiale (arma del delitto o tracce ematiche fresche nella casa, già ampiamente ridipinta nel 1948).\n"
                + "\tIl Dr. Hodel, avvertito del sospetto, lascia gli Stati Uniti per trasferirsi nelle Filippine prima che possa essere emesso un mandato d'arresto.");

        i1.analizza(s1, v1);
}