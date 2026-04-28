package e7;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o00.x0;
import q1.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f15810a = new b0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a40.i f15811b = new a40.i(4);

    public static h a(Context context, List list) {
        String str;
        Typeface typefaceC;
        Trace.beginSection(x0.G("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < list.size(); i11++) {
                d dVar = (d) list.get(i11);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = x6.f.c((str = dVar.f15816e))) == null || x6.f.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), dVar, context.getResources());
                    if (providerInfoB == null) {
                        return new h();
                    }
                    arrayList.add(c(context, dVar, providerInfoB.authority));
                } else {
                    arrayList.add(new i[]{new i(str, dVar.f15817f)});
                }
            }
            return new h(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        a40.i iVar = f15811b;
        b0 b0Var = f15810a;
        Trace.beginSection(x0.G("FontProvider.getProvider"));
        try {
            List listL = dVar.f15815d;
            String str = dVar.f15812a;
            String str2 = dVar.f15813b;
            if (listL == null) {
                listL = w6.a.l(resources, 0);
            }
            b bVar = new b();
            bVar.f15807a = str;
            bVar.f15808b = str2;
            bVar.f15809c = listL;
            ProviderInfo providerInfo = (ProviderInfo) b0Var.c(bVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, iVar);
            for (int i11 = 0; i11 < listL.size(); i11++) {
                ArrayList arrayList2 = new ArrayList((Collection) listL.get(i11));
                Collections.sort(arrayList2, iVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i12), (byte[]) arrayList2.get(i12))) {
                            break;
                        }
                    }
                    b0Var.d(bVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, d dVar, String str) {
        Trace.beginSection(x0.G("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(x0.G("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {dVar.f15814c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e5) {
                            Log.w("FontsProvider", "Unable to query the content provider", e5);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i11 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, dVar.f15817f, i11));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (i[]) arrayList.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } finally {
        }
    }
}
