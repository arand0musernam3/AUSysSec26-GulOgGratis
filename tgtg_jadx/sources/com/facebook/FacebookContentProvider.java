package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.io.FileNotFoundException;
import java.util.UUID;
import kotlin.text.StringsKt__StringsKt;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class FacebookContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        Pair pair;
        String path;
        uri.getClass();
        str.getClass();
        try {
            path = uri.getPath();
        } catch (Exception unused) {
            pair = null;
        }
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String[] strArr = (String[]) StringsKt__StringsKt.split$default(path.substring(1), new String[]{ExpiryDateInput.SEPARATOR}, false, 0, 6, null).toArray(new String[0]);
        String str2 = strArr[0];
        String str3 = strArr[1];
        if ("..".contentEquals(str2) || "..".contentEquals(str3)) {
            throw new Exception();
        }
        pair = new Pair(UUID.fromString(str2), str3);
        if (pair == null) {
            throw new FileNotFoundException();
        }
        try {
            UUID uuid = (UUID) pair.first;
            if (n0.x((String) pair.second) || uuid == null) {
                throw new FileNotFoundException();
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e5) {
            Log.e("com.facebook.FacebookContentProvider", "Got unexpected exception:" + e5);
            throw e5;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }
}
