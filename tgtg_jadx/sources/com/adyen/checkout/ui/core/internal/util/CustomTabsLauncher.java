package com.adyen.checkout.ui.core.internal.util;

import ae.c;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import com.adyen.checkout.ui.core.R;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import ky.p;
import org.jetbrains.annotations.NotNull;
import oz.m;
import u.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\t*\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/CustomTabsLauncher;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lu/a;", "getDefaultColorSchemeParams", "(Landroid/content/Context;)Lu/a;", "", "attribute", "getColorOrNull", "(Landroid/content/Context;I)Ljava/lang/Integer;", "Landroid/net/Uri;", "uri", "", "launchCustomTab", "(Landroid/content/Context;Landroid/net/Uri;)Z", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomTabsLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTabsLauncher.kt\ncom/adyen/checkout/ui/core/internal/util/CustomTabsLauncher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class CustomTabsLauncher {

    @NotNull
    public static final CustomTabsLauncher INSTANCE = new CustomTabsLauncher();

    private CustomTabsLauncher() {
    }

    private final Integer getColorOrNull(Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.AdyenCheckout_CustomTabs, new int[]{i11});
        typedArrayObtainStyledAttributes.getClass();
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, -1));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        typedArrayObtainStyledAttributes.recycle();
        return numValueOf;
    }

    private final a getDefaultColorSchemeParams(Context context) {
        Integer colorOrNull = getColorOrNull(context, R.attr.adyenCustomTabsToolbarColor);
        Integer colorOrNull2 = getColorOrNull(context, R.attr.adyenCustomTabsSecondaryToolbarColor);
        Integer colorOrNull3 = getColorOrNull(context, R.attr.adyenCustomTabsNavigationBarColor);
        Integer colorOrNull4 = getColorOrNull(context, R.attr.adyenCustomTabsNavigationBarDividerColor);
        return new a(colorOrNull != null ? Integer.valueOf(colorOrNull.intValue() | RoundCornerImageView.DEFAULT_STROKE_COLOR) : null, colorOrNull2 != null ? Integer.valueOf(colorOrNull2.intValue()) : null, colorOrNull3 != null ? Integer.valueOf(colorOrNull3.intValue() | RoundCornerImageView.DEFAULT_STROKE_COLOR) : null, colorOrNull4 != null ? Integer.valueOf(colorOrNull4.intValue()) : null);
    }

    public final boolean launchCustomTab(@NotNull Context context, @NotNull Uri uri) {
        context.getClass();
        uri.getClass();
        try {
            c cVar = new c();
            cVar.f1243b = new Intent("android.intent.action.VIEW");
            cVar.f1244c = new p(21);
            cVar.f1242a = true;
            ((Intent) cVar.f1243b).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            cVar.f1246e = getDefaultColorSchemeParams(context).a();
            m mVarC = cVar.c();
            Intent intent = (Intent) mVarC.f33836b;
            intent.setData(uri);
            context.startActivity(intent, (Bundle) mVarC.f33837c);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
