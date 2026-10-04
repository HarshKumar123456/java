package com.harsh;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

// Ya to ham log component scan wala feature use karke @Component lagakar sabhi classes jo bhi available hain unko track karwa sakte hain yaa phir alternate tarika hai ki sabko ham yahan configuration file mein @Bean annotation lagakar apne hisab se configure karen taaki un classes ko ye idea hi na rahe ki unhe Spring Framework ke dwara track kiya ja raha hai and both works depends ki ham kya implementation lekar aage badhna chahte hain jaise dekho apne example mein Mobile ko bilkul khabar nahin hai ki use Spring Framework Track kar raha hai samjhe
@ComponentScan("com.harsh")
public class YoConfigurationFileHaiBhai {
    


    // Bean ka naam bhi de sakte hain sirf ek 
    // @Bean (name = "mobile") // Is tarah karoge to neeche ke function ka naam bhi vahi rakhna jo double quoted string mein likha hai nahin to exception aayega is tarah ka org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.harsh.Mobile' available: expected single matching bean but found 2: mobile,phone
    @Bean (name = {"phone","mobile"}) // Is tarah bhi declare karo to jo function ka naam hai vo present hona chahiye ismein yaani ki is name ki list mein nahin to phirse exception aayega samjhe
    @Scope ("prototype") // By default idhar bhi scope jo hai na vo singleton hi rahta hai par ham log kya kar sakte hain ki ismein string mein de sakte hain jis bhi type ka banana ho apne ko scope jaise WebApplicationContext mein SCOPE_REQUEST aur SCOPE_SESSION jaisi cheejein bhi de sakte hain aur to aur phir ham log custom scopes bhi define kar sakte hain samjhe
    
    
    // Ek Tarika 
    // Ye bhi chalta hai but kyonki ismein kya hai ki ek dependency hai Sim wali to ye NullPointerException deta ki sim is null samjhe isliye neeche wala use kiya hai
    // public Mobile mobile() {
    //     return new Mobile();
    // }

    // Ek Tarika 
    // Ab ye jo configuration hai usmein important hai ki apni ek hi bean honi chahiye par apne paas multiple hain to apne ko Primary batani padegi samjhe
    // Yahi basically Autowire hai idhar ham log explicitly bata nahin rahe hain although bata rahe hain par iska dhyan apne Spring Framework bhaiya rakhenge samjhe
    public  Mobile mobile(Sim sim) {
        Mobile yahMobileHai = new Mobile();
        yahMobileHai.sim = sim;

        return yahMobileHai;    
    }


}
