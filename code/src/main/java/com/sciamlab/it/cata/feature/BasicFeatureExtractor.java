package com.sciamlab.it.cata.feature;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import com.sciamlab.it.cata.classifier.PredictionEntry;

public abstract class BasicFeatureExtractor implements FeatureExtractor {

	protected HashSet<String> stopwords;

	protected void setStopwords(){
		stopwords.add("ministero");
		stopwords.add("dataset");
		stopwords.add("tav");
		stopwords.add("liv");
		stopwords.add("sparql");
		stopwords.add("rdf");
		stopwords.add("com");
		stopwords.add("art");
		stopwords.add("allegato");
		stopwords.add("legge");
		stopwords.add("comma");
		stopwords.add("articolo");
		stopwords.add("gennaio");
		stopwords.add("febbraio");
		stopwords.add("marzo");
		stopwords.add("aprile");
		stopwords.add("maggio");
		stopwords.add("giugno");
		stopwords.add("luglio");
		stopwords.add("agosto");
		stopwords.add("settembre");
		stopwords.add("ottobre");
		stopwords.add("novembre");
		stopwords.add("dicembre");
		stopwords.add("lunedì");
		stopwords.add("martedì");
		stopwords.add("mercoledì");
		stopwords.add("giovedì");
		stopwords.add("venerdì");
		stopwords.add("sabato");
		stopwords.add("domenica");
		stopwords.add("pagina");
		stopwords.add("pag");
		stopwords.add("allegato");
		stopwords.add("allegare");
		stopwords.add("ad");
		stopwords.add("al");
		stopwords.add("allo");         
		stopwords.add("ai");
		stopwords.add("agli");    
		stopwords.add("all");      
		stopwords.add("agl");        
		stopwords.add("alla");       
		stopwords.add("alle");      
		stopwords.add("con");   
		stopwords.add("col"); 
		stopwords.add("coi");
		stopwords.add("da");         
		stopwords.add("dal");      
		stopwords.add("dallo");          
		stopwords.add("dai");            
		stopwords.add("dagli");          
		stopwords.add("dall");         
		stopwords.add("dagl");
		stopwords.add("dalla");          
		stopwords.add("dalle");          
		stopwords.add("di");            
		stopwords.add("del");            
		stopwords.add("dello");          
		stopwords.add("dei");            
		stopwords.add("degli");
		stopwords.add("dell");
		stopwords.add("degl");
		stopwords.add("della");
		stopwords.add("delle");
		stopwords.add("in");
		stopwords.add("nel");
		stopwords.add("nello");
		stopwords.add("nei");
		stopwords.add("negli");		
		stopwords.add("nell");
		stopwords.add("negl");
		stopwords.add("nella");
		stopwords.add("nelle");
		stopwords.add("su");   
		stopwords.add("sul");  
		stopwords.add("sullo");
		stopwords.add("sui");  
		stopwords.add("sugli");
		stopwords.add("sull"); 
		stopwords.add("sugl"); 
		stopwords.add("sulla");
		stopwords.add("sulle");
		stopwords.add("per");  
		stopwords.add("tra"); 
		stopwords.add("contro");
		stopwords.add("io");    
		stopwords.add("tu");   
		stopwords.add("lui");  
		stopwords.add("lei");  
		stopwords.add("noi");  
		stopwords.add("voi");  
		stopwords.add("loro"); 
		stopwords.add("mio");  
		stopwords.add("mia");
		stopwords.add("mie");
		stopwords.add("tuo");
		stopwords.add("tua");
		stopwords.add("tuoi");
		stopwords.add("tue");
		stopwords.add("suo");
		stopwords.add("sua");
		stopwords.add("suoi");
		stopwords.add("sue");
		stopwords.add("nostro");
		stopwords.add("nostra");
		stopwords.add("nostri");
		stopwords.add("nostre");
		stopwords.add("vostro");
		stopwords.add("vostra");
		stopwords.add("vostri");
		stopwords.add("vostre");
		stopwords.add("mi");
		stopwords.add("ti");
		stopwords.add("ci");
		stopwords.add("vi");
		stopwords.add("lo");
		stopwords.add("la");
		stopwords.add("li");
		stopwords.add("le");
		stopwords.add("gli");
		stopwords.add("ne");
		stopwords.add("il"); 
		stopwords.add("un");
		stopwords.add("uno");
		stopwords.add("una");
		stopwords.add("ma");
		stopwords.add("ed");
		stopwords.add("se");
		stopwords.add("perché");
		stopwords.add("anche");
		stopwords.add("come");
		stopwords.add("dov");
		stopwords.add("dove");
		stopwords.add("che");
		stopwords.add("chi");
		stopwords.add("cui");
		stopwords.add("non");
		stopwords.add("più");          
		stopwords.add("quale");
		stopwords.add("quanto");
		stopwords.add("quanti");
		stopwords.add("quanta");
		stopwords.add("quante");
		stopwords.add("quello");
		stopwords.add("quelli");
		stopwords.add("quella");
		stopwords.add("quelle");
		stopwords.add("questo");
		stopwords.add("questi");
		stopwords.add("questa");
		stopwords.add("queste");
		stopwords.add("tutto");
		stopwords.add("tutti");
		stopwords.add("a");
		stopwords.add("c");
		stopwords.add("e");
		stopwords.add("i");
		stopwords.add("d");
		stopwords.add("l");
		stopwords.add("o");
		stopwords.add("ho");
		stopwords.add("hai");
		stopwords.add("ha");
		stopwords.add("abbiamo");
		stopwords.add("avete");
		stopwords.add("hanno");
		stopwords.add("abbia");
		stopwords.add("abbiate");
		stopwords.add("abbiano");
		stopwords.add("avrò");
		stopwords.add("avrai");
		stopwords.add("avrà");
		stopwords.add("avremo");
		stopwords.add("avrete");
		stopwords.add("avranno");
		stopwords.add("avrei");
		stopwords.add("avresti");
		stopwords.add("avrebbe");
		stopwords.add("avremmo");
		stopwords.add("avreste");
		stopwords.add("avrebbero");
		stopwords.add("avevo");
		stopwords.add("avevi");
		stopwords.add("aveva");
		stopwords.add("avevamo");
		stopwords.add("avevate");
		stopwords.add("avevano");
		stopwords.add("ebbi");
		stopwords.add("avesti");
		stopwords.add("ebbe");
		stopwords.add("avemmo");
		stopwords.add("aveste");
		stopwords.add("ebbero");
		stopwords.add("avessi");
		stopwords.add("avesse");
		stopwords.add("avessimo");
		stopwords.add("avessero");
		stopwords.add("avendo");
		stopwords.add("avuto");
		stopwords.add("avuta");
		stopwords.add("avuti");
		stopwords.add("avute");
		stopwords.add("sono");
		stopwords.add("sei");
		stopwords.add("è");
		stopwords.add("siamo");
		stopwords.add("siete");
		stopwords.add("sia");
		stopwords.add("siate");
		stopwords.add("siano");
		stopwords.add("sarò");
		stopwords.add("sarai");
		stopwords.add("sarà");
		stopwords.add("saremo");
		stopwords.add("sarete");
		stopwords.add("saranno");
		stopwords.add("sarei");
		stopwords.add("saresti");
		stopwords.add("sarebbe");
		stopwords.add("saremmo");
		stopwords.add("sareste");
		stopwords.add("sarebbero");
		stopwords.add("ero");
		stopwords.add("eri");
		stopwords.add("era");
		stopwords.add("eravamo");
		stopwords.add("eravate");
		stopwords.add("erano");
		stopwords.add("fui");
		stopwords.add("fosti");
		stopwords.add("fu");
		stopwords.add("fummo");
		stopwords.add("foste");
		stopwords.add("furono");
		stopwords.add("fossi");
		stopwords.add("fosse");
		stopwords.add("fossimo");
		stopwords.add("fossero");
		stopwords.add("essendo");
		stopwords.add("faccio");
		stopwords.add("fai");
		stopwords.add("facciamo");
		stopwords.add("fanno");
		stopwords.add("faccia");
		stopwords.add("facciate");
		stopwords.add("facciano");
		stopwords.add("farò");
		stopwords.add("farai");
		stopwords.add("farà");
		stopwords.add("faremo");
		stopwords.add("farete");
		stopwords.add("faranno");
		stopwords.add("farei");
		stopwords.add("faresti");
		stopwords.add("farebbe");
		stopwords.add("faremmo");
		stopwords.add("fareste");
		stopwords.add("farebbero");
		stopwords.add("facevo");
		stopwords.add("facevi");
		stopwords.add("faceva");
		stopwords.add("facevamo");
		stopwords.add("facevate");
		stopwords.add("facevano");
		stopwords.add("feci");
		stopwords.add("facesti");
		stopwords.add("fece");
		stopwords.add("facemmo");
		stopwords.add("faceste");
		stopwords.add("fecero");
		stopwords.add("facessi");
		stopwords.add("facesse");
		stopwords.add("facessimo");
		stopwords.add("facessero");
		stopwords.add("facendo");
		stopwords.add("sto");
		stopwords.add("stai");
		stopwords.add("sta");
		stopwords.add("stiamo");
		stopwords.add("stanno");
		stopwords.add("stia");
		stopwords.add("stiate");
		stopwords.add("stiano");
		stopwords.add("starò");
		stopwords.add("starai");
		stopwords.add("starà");
		stopwords.add("staremo");
		stopwords.add("starete");
		stopwords.add("staranno");
		stopwords.add("starei");
		stopwords.add("staresti");
		stopwords.add("starebbe");
		stopwords.add("staremmo");
		stopwords.add("stareste");
		stopwords.add("starebbero");
		stopwords.add("stavo");
		stopwords.add("stavi");
		stopwords.add("stava");
		stopwords.add("stavamo");
		stopwords.add("stavate");
		stopwords.add("stavano");
		stopwords.add("stetti");
		stopwords.add("stesti");
		stopwords.add("stette");
		stopwords.add("stemmo");
		stopwords.add("steste");
		stopwords.add("stettero");
		stopwords.add("stessi");
		stopwords.add("stesse");
		stopwords.add("stessimo");
		stopwords.add("stessero");
		stopwords.add("stando");
	}

	//main method for feature extraction
	public abstract List<String> execute(String text);

	public List<String> extract(PredictionEntry entry) throws Exception {
		List<String> res= new ArrayList<String>();

		if(entry.title!=null){
			res.addAll(this.execute(entry.title));
		}
		if(entry.description!=null){
			res.addAll(this.execute(entry.description));
		}
		for(String s:entry.tags) res.addAll(this.execute(s));
		
		return res;
	}

}
