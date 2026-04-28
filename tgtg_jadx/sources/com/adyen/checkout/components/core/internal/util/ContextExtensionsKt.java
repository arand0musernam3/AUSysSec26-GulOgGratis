package com.adyen.checkout.components.core.internal.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.widget.Toast;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001e\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"copyTextToClipboard", "", "Landroid/content/Context;", AnnotatedPrivateKey.LABEL, "", TextBundle.TEXT_ENTRY, "createLocalizedContext", "locale", "Ljava/util/Locale;", "toast", InAppMessageBase.DURATION, "", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContextExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextExtensions.kt\ncom/adyen/checkout/components/core/internal/util/ContextExtensionsKt\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,48:1\n31#2:49\n*S KotlinDebug\n*F\n+ 1 ContextExtensions.kt\ncom/adyen/checkout/components/core/internal/util/ContextExtensionsKt\n*L\n24#1:49\n*E\n"})
public final class ContextExtensionsKt {
    public static final void copyTextToClipboard(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
    }

    @NotNull
    public static final Context createLocalizedContext(@NotNull Context context, @NotNull Locale locale) {
        context.getClass();
        locale.getClass();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        return contextCreateConfigurationContext == null ? context : contextCreateConfigurationContext;
    }

    public static final void toast(@NotNull Context context, @NotNull String str, int i11) {
        context.getClass();
        str.getClass();
        Toast.makeText(context, str, i11).show();
    }

    public static /* synthetic */ void toast$default(Context context, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        toast(context, str, i11);
    }
}
