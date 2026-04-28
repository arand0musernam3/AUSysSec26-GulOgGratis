package com.braze.triggers.managers;

import android.content.Context;
import android.net.Uri;
import com.braze.f1;
import com.braze.storage.q3;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.support.q;
import j4.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10851e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3 f10852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f10855d;

    public b(Context context, String str) {
        context.getClass();
        str.getClass();
        q3 q3Var = new q3(context, str);
        this.f10852a = q3Var;
        this.f10853b = f10851e.a(q3Var);
        this.f10854c = new LinkedHashMap();
        this.f10855d = new File(k.l(context.getCacheDir().getPath(), "/ab_triggers"));
    }

    public static final String b(com.braze.triggers.actions.a aVar) {
        return e0.f.k("Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: ", ((com.braze.triggers.actions.g) aVar).c());
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return e0.f.k("No local assets found for action id: ", ((com.braze.triggers.actions.g) aVar).c());
    }

    public static final String d(String str, String str2) {
        return s.k("Added to DataStore: ", str, " -> ", str2);
    }

    public static final String e(String str) {
        return e0.f.k("Failed to add new local path for remote path ", str);
    }

    public static final String f(String str) {
        return e0.f.k("Removed from DataStore: ", str);
    }

    public final String a(com.braze.triggers.utils.a aVar) {
        Long lA;
        aVar.getClass();
        String str = aVar.f10886b;
        int iOrdinal = aVar.f10885a.ordinal();
        if (iOrdinal == 0) {
            String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.f10855d, str);
            if (localHtmlUrlFromRemoteUrl == null || StringsKt.H(localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.e(str, 3), 7, (Object) null);
                return null;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new qw.d(localHtmlUrlFromRemoteUrl, str, 2), 6, (Object) null);
            return localHtmlUrlFromRemoteUrl;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            e40.a.f();
            return null;
        }
        String strB = f10851e.b(str);
        try {
            String string = this.f10855d.toString();
            string.getClass();
            Pair pairDownloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(string, str, strB, null, 8, null);
            File file = (File) pairDownloadFileToPath$default.f26485a;
            Map map = (Map) pairDownloadFileToPath$default.f26486b;
            String str2 = (String) map.get("expires");
            if (str2 != null && (lA = q.a(str2)) != null && lA.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.b(1, str, map), 7, (Object) null);
                return null;
            }
            Uri uriFromFile = Uri.fromFile(file);
            if (uriFromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.ui.inappmessage.listeners.a(uriFromFile, str, 1), 6, (Object) null);
                return uriFromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.e(str, 1), 7, (Object) null);
            return null;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new qw.e(str, 2), 4, (Object) null);
            return null;
        }
    }

    public static final String d(String str) {
        return e0.f.k("Could not find local asset for remote path ", str);
    }

    public static final String b(String str, String str2) {
        return s.k("Found local asset at path ", str, " for remote asset at path: ", str2);
    }

    public static final String c(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Adding new local path '", str, "' for remote path '", str2, "' to cache.");
    }

    public static final String b(String str) {
        return a0.p("Failed to store asset for remote path ", str, ". Not storing local asset");
    }

    public static final String c(String str) {
        return a0.p("Failed to store html zip asset for remote path ", str, ". Not storing local asset");
    }

    public final void a(List list) {
        list.getClass();
        a aVar = f10851e;
        Pair pairA = aVar.a(list);
        Set set = (Set) pairA.f26485a;
        LinkedHashSet linkedHashSetA = aVar.a(this.f10853b, (Set) pairA.f26486b, this.f10854c);
        aVar.a(this.f10855d, this.f10853b, this.f10854c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<com.braze.triggers.utils.a> arrayList = new ArrayList();
        for (Object obj : set) {
            if (!this.f10853b.containsKey(((com.braze.triggers.utils.a) obj).f10886b)) {
                arrayList.add(obj);
            }
        }
        for (com.braze.triggers.utils.a aVar2 : arrayList) {
            String str = aVar2.f10886b;
            try {
                String strA = a(aVar2);
                if (strA != null && !StringsKt.H(strA)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.d(strA, str, 0), 7, (Object) null);
                    this.f10853b.put(str, strA);
                    linkedHashMap.put(str, strA);
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.d(str, 29), 4, (Object) null);
            }
        }
        a(linkedHashMap, linkedHashSetA);
    }

    public final Map a(com.braze.triggers.actions.a aVar) {
        aVar.getClass();
        if (!((com.braze.triggers.actions.g) aVar).f10800c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(aVar, 1), 7, (Object) null);
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = aVar.b().iterator();
        while (it.hasNext()) {
            String str = ((com.braze.triggers.utils.a) it.next()).f10886b;
            String str2 = (String) this.f10853b.get(str);
            if (str2 != null && new File(str2).exists()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.d(str2, str, 1), 7, (Object) null);
                this.f10854c.put(str, str2);
                linkedHashMap.put(str, str2);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new qw.e(str, 0), 6, (Object) null);
            }
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new qw.a(aVar, 2), 6, (Object) null);
        }
        return linkedHashMap;
    }

    public static final String a(String str, String str2) {
        return s.k("Storing local triggered action html zip asset at local path ", str, " for remote path ", str2);
    }

    public static final String a(String str) {
        return e0.f.k("Could not download ", str);
    }

    public static final String a(String str, Map map) {
        return "Not caching " + str + " due to headers " + map;
    }

    public static final String a(Uri uri, String str) {
        return s.k("Storing local triggered action asset at local path ", uri.getPath(), " for remote path ", str);
    }

    public final void a(LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) throws Throwable {
        linkedHashMap.getClass();
        linkedHashSet.getClass();
        if (linkedHashMap.isEmpty() && linkedHashSet.isEmpty()) {
            return;
        }
        try {
            this.f10852a.batchUpdate(linkedHashMap, linkedHashSet);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1((String) entry.getKey(), (String) entry.getValue(), 29), 7, (Object) null);
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.d((String) it.next(), 28), 7, (Object) null);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new qw.c(1), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to update DataStore";
    }
}
