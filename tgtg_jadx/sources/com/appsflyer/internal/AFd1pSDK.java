package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n13004#2,3:103\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/helpers/StringExtensionsKt\n*L\n44#1:103,3\n*E\n"})
public final class AFd1pSDK {
    @NotNull
    public static final String AFAdRevenueData(@NotNull String str) {
        str.getClass();
        return "[Exception Manager]: " + str;
    }

    @Nullable
    public static final Pair<Integer, Integer> getCurrencyIso4217Code(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        str.getClass();
        kotlin.text.l lVarD = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").d(str);
        if (lVarD != null) {
            kotlin.collections.j jVar = lVarD.f26616c;
            MatchGroup matchGroupD = jVar.d(1);
            Integer intOrNull = (matchGroupD == null || (str4 = matchGroupD.f26584a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupD2 = jVar.d(3);
            Integer intOrNull2 = (matchGroupD2 == null || (str3 = matchGroupD2.f26584a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupD3 = jVar.d(4);
            Integer intOrNull3 = (matchGroupD3 == null || (str2 = matchGroupD3.f26584a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    @Nullable
    public static final Pair<Integer, Integer> getMediationNetwork(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str.getClass();
        kotlin.text.l lVarD = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").d(str);
        if (lVarD != null) {
            kotlin.collections.j jVar = lVarD.f26616c;
            MatchGroup matchGroupD = jVar.d(1);
            Integer intOrNull = (matchGroupD == null || (str7 = matchGroupD.f26584a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroupD2 = jVar.d(2);
            Integer intOrNull2 = (matchGroupD2 == null || (str6 = matchGroupD2.f26584a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup matchGroupD3 = jVar.d(3);
            Integer intOrNull3 = (matchGroupD3 == null || (str5 = matchGroupD3.f26584a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroupD4 = jVar.d(4);
            Integer intOrNull4 = (matchGroupD4 == null || (str4 = matchGroupD4.f26584a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupD5 = jVar.d(5);
            Integer intOrNull5 = (matchGroupD5 == null || (str3 = matchGroupD5.f26584a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupD6 = jVar.d(6);
            Integer intOrNull6 = (matchGroupD6 == null || (str2 = matchGroupD6.f26584a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                intOrNull.getClass();
                int iIntValue = intOrNull.intValue() * 1000000;
                intOrNull2.getClass();
                int iIntValue2 = (intOrNull2.intValue() * 1000) + iIntValue;
                intOrNull3.getClass();
                Integer numValueOf = Integer.valueOf(intOrNull3.intValue() + iIntValue2);
                intOrNull4.getClass();
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                intOrNull5.getClass();
                int iIntValue4 = (intOrNull5.intValue() * 1000) + iIntValue3;
                num.getClass();
                return new Pair<>(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
            }
        }
        return null;
    }

    private static boolean getRevenue(@NotNull Object... objArr) {
        objArr.getClass();
        return !y.v(objArr, null);
    }

    public static final String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        String strConcat = "";
        for (byte b8 : bArrDigest) {
            strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b8)}, 1)));
        }
        return strConcat;
    }
}
