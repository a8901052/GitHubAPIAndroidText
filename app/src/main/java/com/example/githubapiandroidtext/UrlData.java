package com.example.githubapiandroidtext;

public class UrlData {
    private final static String LIST_URL = "https://developer.github.com/v3/users/#get-all-users";
    private final static String PAGINATION_URL = "https://developer.github.com/v3/#link-header";
    private final static String DETAIL_URL = "https://developer.github.com/v3/users/#get-a-single-user";

    public static PeopleService create() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(PeopleService.class);
    }

}
