package com.example.nbcsearchsave.retrofit

import com.google.gson.annotations.SerializedName
import java.util.Date

data class KakaoResponse(
    @SerializedName("meta")
    val meta: MetaData,
    @SerializedName("documents")
    var documents: MutableList<ImageDocument>
)

data class MetaData(
    @SerializedName("total_count")
    val totalCount: Int?,
    @SerializedName("is_end")
    val isEnd: Boolean?
)

data class ImageDocument(
    @SerializedName("collection")
    val collection: String?, // 컬렉션
    @SerializedName("datetime")
    val dateTime: Date?, // 미리보기 이미지 URL
    @SerializedName("display_sitename")
    val displaySiteName: String?, // 이미지 URL
    @SerializedName("doc_url")
    val docUrl: String?, // 이미지의 가로 길이
    @SerializedName("height")
    val height: Int?, // 이미지의 세로 길이
    @SerializedName("image_url")
    val imageUrl: String?, // 출처
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String?, // 문서 URL
    @SerializedName("width")
    val width: Int? // 문서 작성시간
)