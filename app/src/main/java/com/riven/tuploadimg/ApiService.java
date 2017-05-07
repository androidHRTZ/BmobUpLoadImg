package com.riven.tuploadimg;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Riven on 2017/5/7.
 * Email: 1819485687@qq.com
 */

public interface ApiService {

    @POST("2/files/myPicture.jpg")
    Observable<ResponseBean> upload(@Body RequestBody img);

}
