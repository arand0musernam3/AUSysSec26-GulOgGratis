package com.braze.ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import e0.f;
import ga0.c;
import j4.s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", "", "getQueryParameters", "", "Landroid/net/Uri;", "getMainActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", InAppMessageBase.EXTRAS, "Landroid/os/Bundle;", "isActivityRegisteredInManifest", "", "className", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUriUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriUtils.kt\ncom/braze/ui/support/UriUtils\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n29#2:88\n774#3:89\n865#3,2:90\n*S KotlinDebug\n*F\n+ 1 UriUtils.kt\ncom/braze/ui/support/UriUtils\n*L\n39#1:88\n44#1:89\n44#1:90,2\n*E\n"})
public final class UriUtils {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    @Nullable
    public static final Intent getMainActivityIntent(@NotNull Context context, @Nullable Bundle bundle) {
        context.getClass();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (bundle != null && launchIntentForPackage != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    public static /* synthetic */ Intent getMainActivityIntent$default(Context context, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return getMainActivityIntent(context, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [T, android.net.Uri] */
    @NotNull
    public static final Map<String, String> getQueryParameters(@NotNull Uri uri) {
        uri.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = uri;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new c(objectRef, 9), 12, (Object) null);
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (((Uri) objectRef.element).isOpaque()) {
                objectRef.element = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
            }
            Set<String> queryParameterNames = ((Uri) objectRef.element).getQueryParameterNames();
            queryParameterNames.getClass();
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            for (String str2 : arrayList) {
                String queryParameter = ((Uri) objectRef.element).getQueryParameter(str2);
                if (queryParameter != null && queryParameter.length() != 0) {
                    linkedHashMap.put(str2, queryParameter);
                }
            }
            return linkedHashMap;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new c(objectRef, 10), 8, (Object) null);
            return linkedHashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$0(Ref.ObjectRef objectRef) {
        return a.c(objectRef.element, "Encoded query is null for Uri: ", " Returning empty map for query parameters");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getQueryParameters$lambda$2(Ref.ObjectRef objectRef) {
        return s.j(objectRef.element, "Failed to map the query parameters of Uri: ");
    }

    public static final boolean isActivityRegisteredInManifest(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, str), PackageManager.ComponentInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getActivityInfo(new ComponentName(context, str), 0);
            return true;
        } catch (PackageManager.NameNotFoundException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new xv.a(str, 3), 8, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isActivityRegisteredInManifest$lambda$3(String str) {
        return f.k("Could not find activity info for class with name: ", str);
    }
}
