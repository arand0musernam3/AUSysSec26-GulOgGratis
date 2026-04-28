package com.braze.support;

import com.braze.support.BrazeLogger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10769a = BrazeLogger.INSTANCE.getBrazeLogTag("HttpUtils");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f10770b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    public static final LinkedHashMap a(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            key.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = ((String) key).toLowerCase(locale);
            lowerCase.getClass();
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(w0.a(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), CollectionsKt.U((Iterable) entry3.getValue(), null, null, null, null, 63));
        }
        return linkedHashMap3;
    }

    public static final String b(String str) {
        return e0.f.k("Could not parse http-date value: ", str);
    }

    public static final Long a(String str) {
        try {
            Double dF = kotlin.text.x.f(str);
            if (dF != null) {
                return Long.valueOf((long) (dF.doubleValue() * 1000));
            }
            Date date = f10770b.parse(str);
            if (date != null) {
                return Long.valueOf(date.getTime() - DateTimeUtils.nowInMilliseconds());
            }
            return null;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10769a, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.d(str, 20), 8, (Object) null);
            return null;
        }
    }
}
