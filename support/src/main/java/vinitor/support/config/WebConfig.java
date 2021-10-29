package vinitor.support.config;

import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(createGson());
    }

    private HttpMessageConverter<?> createGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter());
        //gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateAdapter());

        GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
        gsonHttpMessageConverter.setGson(gsonBuilder.serializeNulls().create());
        return gsonHttpMessageConverter;
    }

}
