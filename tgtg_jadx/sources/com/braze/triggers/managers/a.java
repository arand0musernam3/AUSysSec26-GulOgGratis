package com.braze.triggers.managers;

import android.content.Context;
import android.net.Uri;
import com.braze.Constants;
import com.braze.f1;
import com.braze.storage.q3;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import d8.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import m2.b2;
import m90.z;
import qb.r;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final String c(File file) {
        return e0.f.k("Deleting triggers directory at: ", file.getAbsolutePath());
    }

    public final void a(File file, ConcurrentHashMap concurrentHashMap, LinkedHashMap linkedHashMap) {
        file.getClass();
        concurrentHashMap.getClass();
        linkedHashMap.getClass();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b2(fileArrListFiles, 20), 6, (Object) null);
        try {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (!concurrentHashMap.containsValue(file2.getPath())) {
                    arrayList.add(file2);
                }
            }
            ArrayList<File> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!linkedHashMap.containsValue(((File) obj).getPath())) {
                    arrayList2.add(obj);
                }
            }
            for (File file3 : arrayList2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.f10851e, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b0(file3, 9), 7, (Object) null);
                file3.getClass();
                BrazeFileUtils.deleteFileOrDirectory(file3);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new q60.a(29), 4, (Object) null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    public final String b(String str) {
        int iJ;
        str.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment != null && lastPathSegment.length() != 0 && (iJ = StringsKt.J(lastPathSegment, '.', 0, 6)) > -1) {
            objectRef.element = lastPathSegment.substring(iJ);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new mw.f(objectRef, str), 6, (Object) null);
        }
        int requestCode = IntentUtils.getRequestCode();
        Object obj = objectRef.element;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(requestCode);
        sb2.append(obj);
        return sb2.toString();
    }

    public static final String b() {
        return "Failed to retrieve local assets from DataStore";
    }

    public static final String b(File file) {
        return a0.p("Deleting obsolete asset '", file.getPath(), "' from filesystem.");
    }

    public final void a(Context context) {
        context.getClass();
        File file = new File(context.getCacheDir(), Constants.TRIGGERS_ASSETS_FOLDER);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b0(file, 8), 6, (Object) null);
        BrazeFileUtils.deleteFileOrDirectory(file);
    }

    public static final String a(Object obj, h8.e eVar) {
        return "Retrieving trigger local asset path '" + obj + "' from DataStore for remote path '" + eVar.f21665a + "'";
    }

    public static final String a(File[] fileArr) {
        return "Local triggered asset directory contains files: ".concat(y.H(fileArr, " , ", null, null, new r(19), 30));
    }

    public static final CharSequence a(File file) {
        String name = file.getName();
        name.getClass();
        return name;
    }

    public static final String a() {
        return "Exception while deleting obsolete assets from filesystem.";
    }

    public final ConcurrentHashMap a(q3 q3Var) {
        q3Var.getClass();
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<h8.e, Object> entry : q3Var.readAllData().entrySet()) {
                h8.e key = entry.getKey();
                Object value = entry.getValue();
                if (!StringsKt.H(key.f21665a) && (value instanceof String) && !StringsKt.H((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.b(0, (String) value, key), 7, (Object) null);
                    concurrentHashMap.put(key.f21665a, value);
                }
            }
            return concurrentHashMap;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new qw.c(0), 4, (Object) null);
            return new ConcurrentHashMap();
        }
    }

    public final LinkedHashSet a(ConcurrentHashMap concurrentHashMap, Set set, LinkedHashMap linkedHashMap) {
        concurrentHashMap.getClass();
        set.getClass();
        linkedHashMap.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new HashSet(concurrentHashMap.keySet()).iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (linkedHashMap.containsKey(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.d(str, 27), 7, (Object) null);
            } else if (!set.contains(str)) {
                String str2 = (String) concurrentHashMap.remove(str);
                str.getClass();
                linkedHashSet.add(str);
                if (str2 != null && !StringsKt.H(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(str2, str, 28), 7, (Object) null);
                    BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                }
            }
        }
        return linkedHashSet;
    }

    public static final String a(String str) {
        return a0.p("Not removing local path for remote path ", str, " from cache because it is being preserved until the end of the app run.");
    }

    public static final String a(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Removing obsolete local path ", str, " for obsolete remote path ", str2, " from cache.");
    }

    public final Pair a(List list) {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) it.next();
            if (!((com.braze.triggers.actions.g) aVar).f10800c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(aVar, 0), 7, (Object) null);
            } else {
                for (com.braze.triggers.utils.a aVar2 : aVar.b()) {
                    String str = aVar2.f10886b;
                    if (!StringsKt.H(str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z(29, aVar, str), 7, (Object) null);
                        linkedHashSet.add(aVar2);
                        linkedHashSet2.add(str);
                    }
                }
            }
        }
        return new Pair(linkedHashSet, linkedHashSet2);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return a0.p("Pre-fetch off for triggered action ", ((com.braze.triggers.actions.g) aVar).c(), ". Not pre-fetching assets.");
    }

    public static final String a(com.braze.triggers.actions.a aVar, String str) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Received new remote path for triggered action ", ((com.braze.triggers.actions.g) aVar).c(), " at ", str, ".");
    }

    public static final String a(Ref.ObjectRef objectRef, String str) {
        return "Using file extension " + objectRef.element + " for remote asset url: " + str;
    }
}
