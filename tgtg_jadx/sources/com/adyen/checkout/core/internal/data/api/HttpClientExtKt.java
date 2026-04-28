package com.adyen.checkout.core.internal.data.api;

import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.HttpException;
import com.adyen.checkout.core.internal.data.model.ErrorResponseBody;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import r8.k;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aJ\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aP\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0087@¢\u0006\u0004\b\f\u0010\n\u001aj\u0010\u0010\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\r*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0087@¢\u0006\u0004\b\u0010\u0010\u0011\u001a8\u0010\u0015\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0012\"\u0004\b\u0001\u0010\r*\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0003*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010 \u001a\u00020\u001f*\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "T", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "", "path", "Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "responseSerializer", "", "queryParameters", "get", "(Lcom/adyen/checkout/core/internal/data/api/HttpClient;Ljava/lang/String;Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "", "getList", "R", "body", "requestSerializer", "post", "(Lcom/adyen/checkout/core/internal/data/api/HttpClient;Ljava/lang/String;Lcom/adyen/checkout/core/internal/data/model/ModelObject;Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "", "Lkotlin/Function1;", "block", "runAndLogHttpException", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/adyen/checkout/core/exception/HttpException;", "getLogMessage", "(Lcom/adyen/checkout/core/exception/HttpException;)Ljava/lang/String;", "Lorg/json/JSONObject;", "toJSONObject", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lcom/adyen/checkout/core/internal/data/api/AdyenApiResponse;", "response", "", "logResponse", "(Ljava/lang/Object;Lcom/adyen/checkout/core/internal/data/api/AdyenApiResponse;)V", "tryToFormatJson", "(Ljava/lang/String;)Ljava/lang/String;", "checkout-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpClientExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientExt.kt\ncom/adyen/checkout/core/internal/data/api/HttpClientExtKt\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,112:1\n74#1,4:130\n78#1:151\n74#1,4:169\n78#1:190\n74#1,4:225\n78#1:246\n16#2,17:113\n16#2,17:134\n16#2,17:152\n16#2,17:173\n16#2,17:191\n16#2,17:208\n16#2,17:229\n16#2,17:247\n16#2,17:264\n16#2,17:282\n16#2,17:300\n16#2,17:317\n216#3:281\n217#3:299\n*S KotlinDebug\n*F\n+ 1 HttpClientExt.kt\ncom/adyen/checkout/core/internal/data/api/HttpClientExtKt\n*L\n30#1:130,4\n30#1:151\n45#1:169,4\n45#1:190\n66#1:225,4\n66#1:246\n28#1:113,17\n30#1:134,17\n43#1:152,17\n45#1:173,17\n60#1:191,17\n64#1:208,17\n66#1:229,17\n77#1:247,17\n99#1:264,17\n101#1:282,17\n103#1:300,17\n104#1:317,17\n100#1:281\n100#1:299\n*E\n"})
public final class HttpClientExtKt {

    /* JADX INFO: renamed from: com.adyen.checkout.core.internal.data.api.HttpClientExtKt$get$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.core.internal.data.api.HttpClientExtKt", f = "HttpClientExt.kt", l = {30}, m = "get")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1<T extends ModelObject> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientExtKt.get(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.core.internal.data.api.HttpClientExtKt$getList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.core.internal.data.api.HttpClientExtKt", f = "HttpClientExt.kt", l = {45}, m = "getList")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00981<T extends ModelObject> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00981(x70.c<? super C00981> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientExtKt.getList(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.core.internal.data.api.HttpClientExtKt$post$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.core.internal.data.api.HttpClientExtKt", f = "HttpClientExt.kt", l = {66}, m = "post")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00991<T extends ModelObject, R extends ModelObject> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00991(x70.c<? super C00991> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientExtKt.post(null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends com.adyen.checkout.core.internal.data.model.ModelObject> java.lang.Object get(@org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.data.api.HttpClient r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<T> r16, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r17, @org.jetbrains.annotations.NotNull x70.c<? super T> r18) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.core.internal.data.api.HttpClientExtKt.get(com.adyen.checkout.core.internal.data.api.HttpClient, java.lang.String, com.adyen.checkout.core.internal.data.model.ModelObject$Serializer, java.util.Map, x70.c):java.lang.Object");
    }

    public static Object get$default(HttpClient httpClient, String str, ModelObject.Serializer serializer, Map map, x70.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        return get(httpClient, str, serializer, map, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends com.adyen.checkout.core.internal.data.model.ModelObject> java.lang.Object getList(@org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.data.api.HttpClient r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<T> r16, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r17, @org.jetbrains.annotations.NotNull x70.c<? super java.util.List<? extends T>> r18) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.core.internal.data.api.HttpClientExtKt.getList(com.adyen.checkout.core.internal.data.api.HttpClient, java.lang.String, com.adyen.checkout.core.internal.data.model.ModelObject$Serializer, java.util.Map, x70.c):java.lang.Object");
    }

    public static Object getList$default(HttpClient httpClient, String str, ModelObject.Serializer serializer, Map map, x70.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        return getList(httpClient, str, serializer, map, cVar);
    }

    private static final String getLogMessage(HttpException httpException) {
        if (httpException.getErrorBody() != null) {
            return JsonUtilsKt.toStringPretty(ErrorResponseBody.SERIALIZER.serialize(httpException.getErrorBody()));
        }
        return "[" + httpException.getCode() + "] " + httpException.getMessage();
    }

    private static final void logResponse(Object obj, AdyenApiResponse adyenApiResponse) {
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = obj.getClass().getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            String strConcat = "CO.".concat(name);
            companion.getLogger().log(adyenLogLevel, strConcat, "response - " + adyenApiResponse.getStatusCode() + " .../" + adyenApiResponse.getPath(), null);
        }
        for (Map.Entry<String, String> entry : adyenApiResponse.getHeaders().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.VERBOSE;
            AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
            if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
                String name2 = obj.getClass().getName();
                String strY2 = StringsKt.Y(name2, '$');
                String strW2 = StringsKt.W('.', strY2, strY2);
                if (strW2.length() != 0) {
                    name2 = StringsKt.O(strW2, "Kt");
                }
                companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), k.m(key, ": ", value), null);
            }
        }
        AdyenLogLevel adyenLogLevel3 = AdyenLogLevel.VERBOSE;
        AdyenLogger.Companion companion3 = AdyenLogger.INSTANCE;
        if (companion3.getLogger().shouldLog(adyenLogLevel3)) {
            String name3 = obj.getClass().getName();
            String strY3 = StringsKt.Y(name3, '$');
            String strW3 = StringsKt.W('.', strY3, strY3);
            if (strW3.length() != 0) {
                name3 = StringsKt.O(strW3, "Kt");
            }
            companion3.getLogger().log(adyenLogLevel3, "CO.".concat(name3), tryToFormatJson(adyenApiResponse.getBody()), null);
        }
        if (companion3.getLogger().shouldLog(adyenLogLevel3)) {
            String name4 = obj.getClass().getName();
            String strY4 = StringsKt.Y(name4, '$');
            String strW4 = StringsKt.W('.', strY4, strY4);
            if (strW4.length() != 0) {
                name4 = StringsKt.O(strW4, "Kt");
            }
            companion3.getLogger().log(adyenLogLevel3, "CO.".concat(name4), "response - END", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends com.adyen.checkout.core.internal.data.model.ModelObject, R extends com.adyen.checkout.core.internal.data.model.ModelObject> java.lang.Object post(@org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.data.api.HttpClient r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull T r18, @org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<T> r19, @org.jetbrains.annotations.NotNull com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<R> r20, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r21, @org.jetbrains.annotations.NotNull x70.c<? super R> r22) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.core.internal.data.api.HttpClientExtKt.post(com.adyen.checkout.core.internal.data.api.HttpClient, java.lang.String, com.adyen.checkout.core.internal.data.model.ModelObject, com.adyen.checkout.core.internal.data.model.ModelObject$Serializer, com.adyen.checkout.core.internal.data.model.ModelObject$Serializer, java.util.Map, x70.c):java.lang.Object");
    }

    public static Object post$default(HttpClient httpClient, String str, ModelObject modelObject, ModelObject.Serializer serializer, ModelObject.Serializer serializer2, Map map, x70.c cVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        return post(httpClient, str, modelObject, serializer, serializer2, map, cVar);
    }

    private static final <T, R> R runAndLogHttpException(T t9, Function1<? super T, ? extends R> function1) {
        try {
            return (R) function1.invoke(t9);
        } catch (HttpException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = t9.getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), f.k("API error - ", getLogMessage(e5)), null);
            }
            throw e5;
        }
    }

    private static final JSONObject toJSONObject(String str) {
        return str.length() == 0 ? new JSONObject() : new JSONObject(str);
    }

    private static final String tryToFormatJson(String str) {
        return y.p(str, "{", false) ? JsonUtilsKt.toStringPretty(new JSONObject(str)) : y.p(str, "[", false) ? JsonUtilsKt.toStringPretty(new JSONArray(str)) : str;
    }
}
