package i;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.activity.result.contract.ActivityResultContract;
import com.braze.h2;
import fd.j;
import h.h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ActivityResultContract {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        if (f5.b.i()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(f5.b.g(hVar.f20953a));
            int iMin = Math.min(5, hVar.f20954b);
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                i4.a.f("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                return null;
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
            return intent;
        }
        if (f5.b.f(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(f5.b.g(hVar.f20953a));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoF = f5.b.f(context);
        if (resolveInfoF == null) {
            h2.b("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoF.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(f5.b.g(hVar.f20953a));
        int iMin2 = Math.min(5, hVar.f20954b);
        if (iMin2 <= 1) {
            i4.a.f("Max items must be greater than 1");
            return null;
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
        return intent3;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final j b(Context context, Object obj) {
        ((h) obj).getClass();
        return null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object c(int i11, Intent intent) {
        Object arrayList;
        if (i11 != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = n0.f26529a;
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
            if (arrayList != null) {
                return arrayList;
            }
        }
        return n0.f26529a;
    }
}
