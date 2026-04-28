package g9;

import android.net.Uri;
import android.os.Bundle;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Regex f20224q = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Regex f20225r = new Regex("\\{(.+?)\\}");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Regex f20226s = new Regex("http[s]?://");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Regex f20227t = new Regex(".*");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Regex f20228u = new Regex("([^/]*?|)");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Regex f20229v = new Regex("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70.t f20235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70.t f20236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f20237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f20239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f20240k;
    public final Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u70.t f20241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f20242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u70.t f20243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f20244p;

    public v(String str, String str2, String str3) {
        List listM0;
        this.f20230a = str;
        this.f20231b = str2;
        this.f20232c = str3;
        ArrayList arrayList = new ArrayList();
        this.f20233d = arrayList;
        final int i11 = 0;
        this.f20235f = u70.l.b(new Function0(this) { // from class: g9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f20215b;

            {
                this.f20215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i11) {
                    case 0:
                        String str4 = this.f20215b.f20234e;
                        if (str4 != null) {
                            return new Regex(str4, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = this.f20215b.f20230a;
                        return Boolean.valueOf(str5 != null && v.f20229v.e(str5));
                    case 2:
                        v vVar = this.f20215b;
                        String str6 = vVar.f20230a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) vVar.f20236g.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        str6.getClass();
                        Uri uri = Uri.parse(str6);
                        uri.getClass();
                        for (String str7 : uri.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str7);
                            if (queryParameters.size() > 1) {
                                i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.d("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str8 == null) {
                                vVar.f20238i = true;
                                str8 = str7;
                            }
                            u uVar = new u();
                            int i12 = 0;
                            for (kotlin.text.l lVarB = Regex.b(v.f20225r, str8); lVarB != null; lVarB = lVarB.next()) {
                                MatchGroup matchGroupD = lVarB.f26616c.d(1);
                                matchGroupD.getClass();
                                String str9 = matchGroupD.f26584a;
                                str9.getClass();
                                uVar.f20221b.add(str9);
                                if (lVarB.b().f26553a > i12) {
                                    String strSubstring = str8.substring(i12, lVarB.b().f26553a);
                                    Regex.f26586b.getClass();
                                    String strQuote = Pattern.quote(strSubstring);
                                    strQuote.getClass();
                                    sb2.append(strQuote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i12 = lVarB.b().f26554b + 1;
                            }
                            if (i12 < str8.length()) {
                                kotlin.text.m mVar = Regex.f26586b;
                                String strSubstring2 = str8.substring(i12);
                                mVar.getClass();
                                String strQuote2 = Pattern.quote(strSubstring2);
                                strQuote2.getClass();
                                sb2.append(strQuote2);
                            }
                            sb2.append("$");
                            uVar.f20220a = v.h(sb2.toString());
                            linkedHashMap.put(str7, uVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = this.f20215b.f20230a;
                        if (str10 != null) {
                            Uri uri2 = Uri.parse(str10);
                            uri2.getClass();
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str10);
                                uri3.getClass();
                                String fragment = uri3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                fragment.getClass();
                                v.a(fragment, arrayList2, sb3);
                                return new Pair(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f20215b.f20239j.getValue();
                        return (pair == null || (list = (List) pair.f26485a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) this.f20215b.f20239j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f26486b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) this.f20215b.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = this.f20215b.f20242n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i12 = 1;
        this.f20236g = u70.l.b(new Function0(this) { // from class: g9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f20215b;

            {
                this.f20215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i12) {
                    case 0:
                        String str4 = this.f20215b.f20234e;
                        if (str4 != null) {
                            return new Regex(str4, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = this.f20215b.f20230a;
                        return Boolean.valueOf(str5 != null && v.f20229v.e(str5));
                    case 2:
                        v vVar = this.f20215b;
                        String str6 = vVar.f20230a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) vVar.f20236g.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        str6.getClass();
                        Uri uri = Uri.parse(str6);
                        uri.getClass();
                        for (String str7 : uri.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str7);
                            if (queryParameters.size() > 1) {
                                i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.d("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str8 == null) {
                                vVar.f20238i = true;
                                str8 = str7;
                            }
                            u uVar = new u();
                            int i122 = 0;
                            for (kotlin.text.l lVarB = Regex.b(v.f20225r, str8); lVarB != null; lVarB = lVarB.next()) {
                                MatchGroup matchGroupD = lVarB.f26616c.d(1);
                                matchGroupD.getClass();
                                String str9 = matchGroupD.f26584a;
                                str9.getClass();
                                uVar.f20221b.add(str9);
                                if (lVarB.b().f26553a > i122) {
                                    String strSubstring = str8.substring(i122, lVarB.b().f26553a);
                                    Regex.f26586b.getClass();
                                    String strQuote = Pattern.quote(strSubstring);
                                    strQuote.getClass();
                                    sb2.append(strQuote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i122 = lVarB.b().f26554b + 1;
                            }
                            if (i122 < str8.length()) {
                                kotlin.text.m mVar = Regex.f26586b;
                                String strSubstring2 = str8.substring(i122);
                                mVar.getClass();
                                String strQuote2 = Pattern.quote(strSubstring2);
                                strQuote2.getClass();
                                sb2.append(strQuote2);
                            }
                            sb2.append("$");
                            uVar.f20220a = v.h(sb2.toString());
                            linkedHashMap.put(str7, uVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = this.f20215b.f20230a;
                        if (str10 != null) {
                            Uri uri2 = Uri.parse(str10);
                            uri2.getClass();
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str10);
                                uri3.getClass();
                                String fragment = uri3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                fragment.getClass();
                                v.a(fragment, arrayList2, sb3);
                                return new Pair(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f20215b.f20239j.getValue();
                        return (pair == null || (list = (List) pair.f26485a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) this.f20215b.f20239j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f26486b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) this.f20215b.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = this.f20215b.f20242n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        u70.m mVar = u70.m.NONE;
        final int i13 = 2;
        this.f20237h = u70.l.a(mVar, new Function0(this) { // from class: g9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f20215b;

            {
                this.f20215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i13) {
                    case 0:
                        String str4 = this.f20215b.f20234e;
                        if (str4 != null) {
                            return new Regex(str4, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = this.f20215b.f20230a;
                        return Boolean.valueOf(str5 != null && v.f20229v.e(str5));
                    case 2:
                        v vVar = this.f20215b;
                        String str6 = vVar.f20230a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) vVar.f20236g.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        str6.getClass();
                        Uri uri = Uri.parse(str6);
                        uri.getClass();
                        for (String str7 : uri.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str7);
                            if (queryParameters.size() > 1) {
                                i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.d("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str8 == null) {
                                vVar.f20238i = true;
                                str8 = str7;
                            }
                            u uVar = new u();
                            int i122 = 0;
                            for (kotlin.text.l lVarB = Regex.b(v.f20225r, str8); lVarB != null; lVarB = lVarB.next()) {
                                MatchGroup matchGroupD = lVarB.f26616c.d(1);
                                matchGroupD.getClass();
                                String str9 = matchGroupD.f26584a;
                                str9.getClass();
                                uVar.f20221b.add(str9);
                                if (lVarB.b().f26553a > i122) {
                                    String strSubstring = str8.substring(i122, lVarB.b().f26553a);
                                    Regex.f26586b.getClass();
                                    String strQuote = Pattern.quote(strSubstring);
                                    strQuote.getClass();
                                    sb2.append(strQuote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i122 = lVarB.b().f26554b + 1;
                            }
                            if (i122 < str8.length()) {
                                kotlin.text.m mVar2 = Regex.f26586b;
                                String strSubstring2 = str8.substring(i122);
                                mVar2.getClass();
                                String strQuote2 = Pattern.quote(strSubstring2);
                                strQuote2.getClass();
                                sb2.append(strQuote2);
                            }
                            sb2.append("$");
                            uVar.f20220a = v.h(sb2.toString());
                            linkedHashMap.put(str7, uVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = this.f20215b.f20230a;
                        if (str10 != null) {
                            Uri uri2 = Uri.parse(str10);
                            uri2.getClass();
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str10);
                                uri3.getClass();
                                String fragment = uri3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                fragment.getClass();
                                v.a(fragment, arrayList2, sb3);
                                return new Pair(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f20215b.f20239j.getValue();
                        return (pair == null || (list = (List) pair.f26485a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) this.f20215b.f20239j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f26486b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) this.f20215b.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = this.f20215b.f20242n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i14 = 3;
        this.f20239j = u70.l.a(mVar, new Function0(this) { // from class: g9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f20215b;

            {
                this.f20215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i14) {
                    case 0:
                        String str4 = this.f20215b.f20234e;
                        if (str4 != null) {
                            return new Regex(str4, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = this.f20215b.f20230a;
                        return Boolean.valueOf(str5 != null && v.f20229v.e(str5));
                    case 2:
                        v vVar = this.f20215b;
                        String str6 = vVar.f20230a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) vVar.f20236g.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        str6.getClass();
                        Uri uri = Uri.parse(str6);
                        uri.getClass();
                        for (String str7 : uri.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str7);
                            if (queryParameters.size() > 1) {
                                i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.d("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str8 == null) {
                                vVar.f20238i = true;
                                str8 = str7;
                            }
                            u uVar = new u();
                            int i122 = 0;
                            for (kotlin.text.l lVarB = Regex.b(v.f20225r, str8); lVarB != null; lVarB = lVarB.next()) {
                                MatchGroup matchGroupD = lVarB.f26616c.d(1);
                                matchGroupD.getClass();
                                String str9 = matchGroupD.f26584a;
                                str9.getClass();
                                uVar.f20221b.add(str9);
                                if (lVarB.b().f26553a > i122) {
                                    String strSubstring = str8.substring(i122, lVarB.b().f26553a);
                                    Regex.f26586b.getClass();
                                    String strQuote = Pattern.quote(strSubstring);
                                    strQuote.getClass();
                                    sb2.append(strQuote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i122 = lVarB.b().f26554b + 1;
                            }
                            if (i122 < str8.length()) {
                                kotlin.text.m mVar2 = Regex.f26586b;
                                String strSubstring2 = str8.substring(i122);
                                mVar2.getClass();
                                String strQuote2 = Pattern.quote(strSubstring2);
                                strQuote2.getClass();
                                sb2.append(strQuote2);
                            }
                            sb2.append("$");
                            uVar.f20220a = v.h(sb2.toString());
                            linkedHashMap.put(str7, uVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = this.f20215b.f20230a;
                        if (str10 != null) {
                            Uri uri2 = Uri.parse(str10);
                            uri2.getClass();
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str10);
                                uri3.getClass();
                                String fragment = uri3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                fragment.getClass();
                                v.a(fragment, arrayList2, sb3);
                                return new Pair(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f20215b.f20239j.getValue();
                        return (pair == null || (list = (List) pair.f26485a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) this.f20215b.f20239j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f26486b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) this.f20215b.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = this.f20215b.f20242n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i15 = 4;
        this.f20240k = u70.l.a(mVar, new Function0(this) { // from class: g9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f20215b;

            {
                this.f20215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i15) {
                    case 0:
                        String str4 = this.f20215b.f20234e;
                        if (str4 != null) {
                            return new Regex(str4, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = this.f20215b.f20230a;
                        return Boolean.valueOf(str5 != null && v.f20229v.e(str5));
                    case 2:
                        v vVar = this.f20215b;
                        String str6 = vVar.f20230a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) vVar.f20236g.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        str6.getClass();
                        Uri uri = Uri.parse(str6);
                        uri.getClass();
                        for (String str7 : uri.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str7);
                            if (queryParameters.size() > 1) {
                                i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.d("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str8 == null) {
                                vVar.f20238i = true;
                                str8 = str7;
                            }
                            u uVar = new u();
                            int i122 = 0;
                            for (kotlin.text.l lVarB = Regex.b(v.f20225r, str8); lVarB != null; lVarB = lVarB.next()) {
                                MatchGroup matchGroupD = lVarB.f26616c.d(1);
                                matchGroupD.getClass();
                                String str9 = matchGroupD.f26584a;
                                str9.getClass();
                                uVar.f20221b.add(str9);
                                if (lVarB.b().f26553a > i122) {
                                    String strSubstring = str8.substring(i122, lVarB.b().f26553a);
                                    Regex.f26586b.getClass();
                                    String strQuote = Pattern.quote(strSubstring);
                                    strQuote.getClass();
                                    sb2.append(strQuote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i122 = lVarB.b().f26554b + 1;
                            }
                            if (i122 < str8.length()) {
                                kotlin.text.m mVar2 = Regex.f26586b;
                                String strSubstring2 = str8.substring(i122);
                                mVar2.getClass();
                                String strQuote2 = Pattern.quote(strSubstring2);
                                strQuote2.getClass();
                                sb2.append(strQuote2);
                            }
                            sb2.append("$");
                            uVar.f20220a = v.h(sb2.toString());
                            linkedHashMap.put(str7, uVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = this.f20215b.f20230a;
                        if (str10 != null) {
                            Uri uri2 = Uri.parse(str10);
                            uri2.getClass();
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str10);
                                uri3.getClass();
                                String fragment = uri3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                fragment.getClass();
                                v.a(fragment, arrayList2, sb3);
                                return new Pair(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f20215b.f20239j.getValue();
                        return (pair == null || (list = (List) pair.f26485a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) this.f20215b.f20239j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f26486b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) this.f20215b.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = this.f20215b.f20242n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i16 = 5;
        this.l = u70.l.a(mVar, new Function0(this) { // from class: g9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f20215b;

            {
                this.f20215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i16) {
                    case 0:
                        String str4 = this.f20215b.f20234e;
                        if (str4 != null) {
                            return new Regex(str4, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = this.f20215b.f20230a;
                        return Boolean.valueOf(str5 != null && v.f20229v.e(str5));
                    case 2:
                        v vVar = this.f20215b;
                        String str6 = vVar.f20230a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) vVar.f20236g.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        str6.getClass();
                        Uri uri = Uri.parse(str6);
                        uri.getClass();
                        for (String str7 : uri.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str7);
                            if (queryParameters.size() > 1) {
                                i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.d("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str8 == null) {
                                vVar.f20238i = true;
                                str8 = str7;
                            }
                            u uVar = new u();
                            int i122 = 0;
                            for (kotlin.text.l lVarB = Regex.b(v.f20225r, str8); lVarB != null; lVarB = lVarB.next()) {
                                MatchGroup matchGroupD = lVarB.f26616c.d(1);
                                matchGroupD.getClass();
                                String str9 = matchGroupD.f26584a;
                                str9.getClass();
                                uVar.f20221b.add(str9);
                                if (lVarB.b().f26553a > i122) {
                                    String strSubstring = str8.substring(i122, lVarB.b().f26553a);
                                    Regex.f26586b.getClass();
                                    String strQuote = Pattern.quote(strSubstring);
                                    strQuote.getClass();
                                    sb2.append(strQuote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i122 = lVarB.b().f26554b + 1;
                            }
                            if (i122 < str8.length()) {
                                kotlin.text.m mVar2 = Regex.f26586b;
                                String strSubstring2 = str8.substring(i122);
                                mVar2.getClass();
                                String strQuote2 = Pattern.quote(strSubstring2);
                                strQuote2.getClass();
                                sb2.append(strQuote2);
                            }
                            sb2.append("$");
                            uVar.f20220a = v.h(sb2.toString());
                            linkedHashMap.put(str7, uVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = this.f20215b.f20230a;
                        if (str10 != null) {
                            Uri uri2 = Uri.parse(str10);
                            uri2.getClass();
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str10);
                                uri3.getClass();
                                String fragment = uri3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                fragment.getClass();
                                v.a(fragment, arrayList2, sb3);
                                return new Pair(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f20215b.f20239j.getValue();
                        return (pair == null || (list = (List) pair.f26485a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) this.f20215b.f20239j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f26486b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) this.f20215b.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = this.f20215b.f20242n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i17 = 6;
        this.f20241m = u70.l.b(new Function0(this) { // from class: g9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f20215b;

            {
                this.f20215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i17) {
                    case 0:
                        String str4 = this.f20215b.f20234e;
                        if (str4 != null) {
                            return new Regex(str4, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = this.f20215b.f20230a;
                        return Boolean.valueOf(str5 != null && v.f20229v.e(str5));
                    case 2:
                        v vVar = this.f20215b;
                        String str6 = vVar.f20230a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) vVar.f20236g.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        str6.getClass();
                        Uri uri = Uri.parse(str6);
                        uri.getClass();
                        for (String str7 : uri.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str7);
                            if (queryParameters.size() > 1) {
                                i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.d("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str8 == null) {
                                vVar.f20238i = true;
                                str8 = str7;
                            }
                            u uVar = new u();
                            int i122 = 0;
                            for (kotlin.text.l lVarB = Regex.b(v.f20225r, str8); lVarB != null; lVarB = lVarB.next()) {
                                MatchGroup matchGroupD = lVarB.f26616c.d(1);
                                matchGroupD.getClass();
                                String str9 = matchGroupD.f26584a;
                                str9.getClass();
                                uVar.f20221b.add(str9);
                                if (lVarB.b().f26553a > i122) {
                                    String strSubstring = str8.substring(i122, lVarB.b().f26553a);
                                    Regex.f26586b.getClass();
                                    String strQuote = Pattern.quote(strSubstring);
                                    strQuote.getClass();
                                    sb2.append(strQuote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i122 = lVarB.b().f26554b + 1;
                            }
                            if (i122 < str8.length()) {
                                kotlin.text.m mVar2 = Regex.f26586b;
                                String strSubstring2 = str8.substring(i122);
                                mVar2.getClass();
                                String strQuote2 = Pattern.quote(strSubstring2);
                                strQuote2.getClass();
                                sb2.append(strQuote2);
                            }
                            sb2.append("$");
                            uVar.f20220a = v.h(sb2.toString());
                            linkedHashMap.put(str7, uVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = this.f20215b.f20230a;
                        if (str10 != null) {
                            Uri uri2 = Uri.parse(str10);
                            uri2.getClass();
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str10);
                                uri3.getClass();
                                String fragment = uri3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                fragment.getClass();
                                v.a(fragment, arrayList2, sb3);
                                return new Pair(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f20215b.f20239j.getValue();
                        return (pair == null || (list = (List) pair.f26485a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) this.f20215b.f20239j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f26486b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) this.f20215b.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = this.f20215b.f20242n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i18 = 7;
        this.f20243o = u70.l.b(new Function0(this) { // from class: g9.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f20215b;

            {
                this.f20215b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, u70.j] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i18) {
                    case 0:
                        String str4 = this.f20215b.f20234e;
                        if (str4 != null) {
                            return new Regex(str4, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = this.f20215b.f20230a;
                        return Boolean.valueOf(str5 != null && v.f20229v.e(str5));
                    case 2:
                        v vVar = this.f20215b;
                        String str6 = vVar.f20230a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) vVar.f20236g.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        str6.getClass();
                        Uri uri = Uri.parse(str6);
                        uri.getClass();
                        for (String str7 : uri.getQueryParameterNames()) {
                            StringBuilder sb2 = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str7);
                            if (queryParameters.size() > 1) {
                                i4.a.i(org.bouncycastle.jcajce.provider.asymmetric.a.d("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str8 = (String) CollectionsKt.firstOrNull(queryParameters);
                            if (str8 == null) {
                                vVar.f20238i = true;
                                str8 = str7;
                            }
                            u uVar = new u();
                            int i122 = 0;
                            for (kotlin.text.l lVarB = Regex.b(v.f20225r, str8); lVarB != null; lVarB = lVarB.next()) {
                                MatchGroup matchGroupD = lVarB.f26616c.d(1);
                                matchGroupD.getClass();
                                String str9 = matchGroupD.f26584a;
                                str9.getClass();
                                uVar.f20221b.add(str9);
                                if (lVarB.b().f26553a > i122) {
                                    String strSubstring = str8.substring(i122, lVarB.b().f26553a);
                                    Regex.f26586b.getClass();
                                    String strQuote = Pattern.quote(strSubstring);
                                    strQuote.getClass();
                                    sb2.append(strQuote);
                                }
                                sb2.append("([\\s\\S]+?)?");
                                i122 = lVarB.b().f26554b + 1;
                            }
                            if (i122 < str8.length()) {
                                kotlin.text.m mVar2 = Regex.f26586b;
                                String strSubstring2 = str8.substring(i122);
                                mVar2.getClass();
                                String strQuote2 = Pattern.quote(strSubstring2);
                                strQuote2.getClass();
                                sb2.append(strQuote2);
                            }
                            sb2.append("$");
                            uVar.f20220a = v.h(sb2.toString());
                            linkedHashMap.put(str7, uVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = this.f20215b.f20230a;
                        if (str10 != null) {
                            Uri uri2 = Uri.parse(str10);
                            uri2.getClass();
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str10);
                                uri3.getClass();
                                String fragment = uri3.getFragment();
                                StringBuilder sb3 = new StringBuilder();
                                fragment.getClass();
                                v.a(fragment, arrayList2, sb3);
                                return new Pair(arrayList2, sb3.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.f20215b.f20239j.getValue();
                        return (pair == null || (list = (List) pair.f26485a) == null) ? new ArrayList() : list;
                    case 5:
                        Pair pair2 = (Pair) this.f20215b.f20239j.getValue();
                        if (pair2 != null) {
                            return (String) pair2.f26486b;
                        }
                        return null;
                    case 6:
                        String str11 = (String) this.f20215b.l.getValue();
                        if (str11 != null) {
                            return new Regex(str11, kotlin.text.q.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = this.f20215b.f20242n;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f20224q.a(str)) {
                String strPattern = f20226s.f26587a.pattern();
                strPattern.getClass();
                sb2.append(strPattern);
            }
            kotlin.text.l lVarB = Regex.b(new Regex("(\\?|#|$)"), str);
            if (lVarB != null) {
                a(str.substring(0, lVarB.b().f26553a), arrayList, sb2);
                this.f20244p = (f20227t.a(sb2) || f20228u.a(sb2)) ? false : true;
                sb2.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.f20234e = h(sb2.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").e(str3)) {
            i4.a.i(w.a0.p("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        List listG = new Regex(ExpiryDateInput.SEPARATOR).g(0, str3);
        if (listG.isEmpty()) {
            listM0 = kotlin.collections.n0.f26529a;
        } else {
            ListIterator listIterator = listG.listIterator(listG.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM0 = CollectionsKt.m0(listG, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listM0 = kotlin.collections.n0.f26529a;
        }
        this.f20242n = kotlin.text.y.n(org.bouncycastle.jcajce.provider.asymmetric.a.d("^(", (String) listM0.get(0), "|[*]+)/(", (String) listM0.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        int i11 = 0;
        for (kotlin.text.l lVarB = Regex.b(f20225r, str); lVarB != null; lVarB = lVarB.next()) {
            MatchGroup matchGroupD = lVarB.f26616c.d(1);
            matchGroupD.getClass();
            arrayList.add(matchGroupD.f26584a);
            if (lVarB.b().f26553a > i11) {
                kotlin.text.m mVar = Regex.f26586b;
                String strSubstring = str.substring(i11, lVarB.b().f26553a);
                mVar.getClass();
                String strQuote = Pattern.quote(strSubstring);
                strQuote.getClass();
                sb2.append(strQuote);
            }
            String strPattern = f20228u.f26587a.pattern();
            strPattern.getClass();
            sb2.append(strPattern);
            i11 = lVarB.b().f26554b + 1;
        }
        if (i11 < str.length()) {
            kotlin.text.m mVar2 = Regex.f26586b;
            String strSubstring2 = str.substring(i11);
            mVar2.getClass();
            String strQuote2 = Pattern.quote(strSubstring2);
            strQuote2.getClass();
            sb2.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, j jVar) {
        if (jVar == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            q0 q0Var = jVar.f20149a;
            str.getClass();
            q0Var.e(bundle, str, q0Var.d(str2));
        }
    }

    public static String h(String str) {
        return (StringsKt.z(str, "\\Q", false) && StringsKt.z(str, "\\E", false)) ? kotlin.text.y.n(str, ".*", "\\E.*\\Q", false) : StringsKt.z(str, "\\.\\*", false) ? kotlin.text.y.n(str, "\\.\\*", ".*", false) : str;
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.f20230a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(str);
        uri2.getClass();
        return CollectionsKt.S(pathSegments, uri2.getPathSegments()).size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, u70.j] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f20237h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.s(((u) it.next()).f20221b, arrayList);
        }
        return CollectionsKt.d0((List) this.f20240k.getValue(), CollectionsKt.d0(arrayList, this.f20233d));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, u70.j] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        kotlin.text.l lVarD;
        kotlin.text.l lVarD2;
        String strDecode;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        Regex regex = (Regex) this.f20235f.getValue();
        if (regex != null && (lVarD = regex.d(uri.toString())) != null) {
            kotlin.collections.o0.f26530a.getClass();
            int i11 = 0;
            Bundle bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (e(lVarD, bundleX, linkedHashMap) && (!((Boolean) this.f20236g.getValue()).booleanValue() || f(uri, bundleX, linkedHashMap))) {
                String fragment = uri.getFragment();
                Regex regex2 = (Regex) this.f20241m.getValue();
                if (regex2 != null && (lVarD2 = regex2.d(String.valueOf(fragment))) != null) {
                    List list = (List) this.f20240k.getValue();
                    ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            kotlin.collections.d0.n();
                            throw null;
                        }
                        String str2 = (String) obj;
                        MatchGroup matchGroupD = lVarD2.f26616c.d(i12);
                        if (matchGroupD == null || (str = matchGroupD.f26584a) == null) {
                            strDecode = null;
                        } else {
                            strDecode = Uri.decode(str);
                            strDecode.getClass();
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleX, str2, strDecode, (j) linkedHashMap.get(str2));
                            arrayList.add(Unit.f26487a);
                            i11 = i12;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (w0.e.F(linkedHashMap, new t(bundleX, 0)).isEmpty()) {
                    return bundleX;
                }
            }
        }
        return null;
    }

    public final boolean e(kotlin.text.l lVar, Bundle bundle, Map map) {
        String str;
        ArrayList arrayList = this.f20233d;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(arrayList, 10));
        int i11 = 0;
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            String strDecode = null;
            if (i11 < 0) {
                kotlin.collections.d0.n();
                throw null;
            }
            String str2 = (String) obj;
            MatchGroup matchGroupD = lVar.f26616c.d(i12);
            if (matchGroupD != null && (str = matchGroupD.f26584a) != null) {
                strDecode = Uri.decode(str);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str2, strDecode, (j) map.get(str2));
                arrayList2.add(Unit.f26487a);
                i11 = i12;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof v)) {
            v vVar = (v) obj;
            if (Intrinsics.areEqual(this.f20230a, vVar.f20230a) && Intrinsics.areEqual(this.f20231b, vVar.f20231b) && Intrinsics.areEqual(this.f20232c, vVar.f20232c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, u70.j] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z11;
        String query;
        for (Map.Entry entry : ((Map) this.f20237h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            u uVar = (u) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.f20238i && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = kotlin.collections.c0.c(query);
            }
            kotlin.collections.o0.f26530a.getClass();
            boolean z12 = false;
            Bundle bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Iterator it = uVar.f20221b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                j jVar = (j) map.get(str2);
                q0 q0Var = jVar != null ? jVar.f20149a : null;
                if ((q0Var instanceof e) && !jVar.f20151c) {
                    e eVar = (e) q0Var;
                    eVar.e(bundleX, str2, eVar.h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = uVar.f20220a;
                kotlin.text.l lVarD = str4 != null ? new Regex(str4).d(str3) : null;
                if (lVarD == null) {
                    return z12;
                }
                ArrayList arrayList = uVar.f20221b;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(arrayList, 10));
                ?? r13 = z12;
                for (Object obj : arrayList) {
                    int i11 = r13 + 1;
                    if (r13 < 0) {
                        kotlin.collections.d0.n();
                        throw null;
                    }
                    String str5 = (String) obj;
                    MatchGroup matchGroupD = lVarD.f26616c.d(i11);
                    String str6 = matchGroupD != null ? matchGroupD.f26584a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    j jVar2 = (j) map.get(str5);
                    try {
                        if (w.b.A(bundleX, str5)) {
                            if (bundleX.containsKey(str5)) {
                                if (jVar2 != null) {
                                    q0 q0Var2 = jVar2.f20149a;
                                    Object objA = q0Var2.a(bundleX, str5);
                                    if (!bundleX.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    q0Var2.e(bundleX, str5, q0Var2.c(objA, str6));
                                }
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            objValueOf = Boolean.valueOf(z11);
                        } else {
                            g(bundleX, str5, str6, jVar2);
                            objValueOf = Unit.f26487a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = Unit.f26487a;
                    }
                    arrayList2.add(objValueOf);
                    r13 = i11;
                    z12 = false;
                }
            }
            bundle.putAll(bundleX);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f20230a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20231b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20232c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
