package androidx.fragment.app;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends ActivityResultContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3196a;

    public /* synthetic */ g1(int i11) {
        this.f3196a = i11;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f3196a) {
            case 0:
                h.g gVar = (h.g) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = gVar.f20950b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = gVar.f20949a;
                        intentSender.getClass();
                        gVar = new h.g(intentSender, null, gVar.f20951c, gVar.f20952d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
                if (FragmentManager.L(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                h.h hVar = (h.h) obj;
                hVar.getClass();
                if (f5.b.i()) {
                    Intent intent3 = new Intent("android.provider.action.PICK_IMAGES");
                    intent3.setType(f5.b.g(hVar.f20953a));
                    intent3.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent3;
                }
                if (f5.b.f(context) == null) {
                    Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent4.setType(f5.b.g(hVar.f20953a));
                    if (intent4.getType() != null) {
                        return intent4;
                    }
                    intent4.setType("*/*");
                    intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent4;
                }
                ResolveInfo resolveInfoF = f5.b.f(context);
                if (resolveInfoF == null) {
                    com.braze.h2.b("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo = resolveInfoF.activityInfo;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent5.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent5.setType(f5.b.g(hVar.f20953a));
                intent5.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent5;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 3:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 4:
                Intent intent6 = (Intent) obj;
                intent6.getClass();
                return intent6;
            case 5:
                h.g gVar2 = (h.g) obj;
                gVar2.getClass();
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar2);
                intentPutExtra3.getClass();
                return intentPutExtra3;
            default:
                Uri uri = (Uri) obj;
                uri.getClass();
                Intent intentAddFlags = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
                intentAddFlags.getClass();
                return intentAddFlags;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public fd.j b(Context context, Object obj) {
        switch (this.f3196a) {
            case 1:
                ((h.h) obj).getClass();
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                    o0Var.getClass();
                    return new fd.j(o0Var, 1);
                }
                for (String str : strArr) {
                    if (androidx.core.app.e.a(context, str) != 0) {
                        return null;
                    }
                }
                int iA = kotlin.collections.w0.a(strArr.length);
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new fd.j(linkedHashMap, 1);
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                if (androidx.core.app.e.a(context, str3) == 0) {
                    return new fd.j(Boolean.TRUE, 1);
                }
                return null;
            case 4:
            case 5:
            default:
                return super.b(context, obj);
            case 6:
                ((Uri) obj).getClass();
                return null;
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object c(int i11, Intent intent) {
        List arrayList;
        switch (this.f3196a) {
            case 0:
                return new h.a(i11, intent);
            case 1:
                if (i11 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = kotlin.collections.n0.f26529a;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i12 = 0; i12 < itemCount; i12++) {
                            Uri uri = clipData.getItemAt(i12).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) CollectionsKt.firstOrNull(arrayList);
            case 2:
                if (i11 != -1) {
                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                    o0Var.getClass();
                    return o0Var;
                }
                if (intent == null) {
                    kotlin.collections.o0 o0Var2 = kotlin.collections.o0.f26530a;
                    o0Var2.getClass();
                    return o0Var2;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    kotlin.collections.o0 o0Var3 = kotlin.collections.o0.f26530a;
                    o0Var3.getClass();
                    return o0Var3;
                }
                ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                for (int i13 : intArrayExtra) {
                    arrayList2.add(Boolean.valueOf(i13 == 0));
                }
                return kotlin.collections.x0.j(CollectionsKt.y0(kotlin.collections.y.w(stringArrayExtra), arrayList2));
            case 3:
                if (intent == null || i11 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z11 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length) {
                            if (intArrayExtra2[i14] == 0) {
                                z11 = true;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z11);
            case 4:
                return new h.a(i11, intent);
            case 5:
                return new h.a(i11, intent);
            default:
                return Boolean.valueOf(i11 == -1);
        }
    }
}
