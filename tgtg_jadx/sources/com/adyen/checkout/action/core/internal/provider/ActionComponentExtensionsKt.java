package com.adyen.checkout.action.core.internal.provider;

import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0004\u001a\u0010\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\"$\u0010\u0000\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"allActionProviders", "", "Lcom/adyen/checkout/components/core/internal/provider/ActionComponentProvider;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "getActionProviderFor", "action", "Lcom/adyen/checkout/components/core/action/Action;", "action-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActionComponentExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionComponentExtensions.kt\ncom/adyen/checkout/action/core/internal/provider/ActionComponentExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n+ 4 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,42:1\n295#2,2:43\n16#3,4:45\n20#3,5:53\n16#3,4:58\n20#3,5:66\n16#3,4:71\n20#3,5:79\n16#3,4:84\n20#3,5:92\n16#3,4:97\n20#3,5:105\n16#3,4:110\n20#3,5:118\n16#3,4:123\n20#3,5:131\n44#4,4:49\n44#4,4:62\n44#4,4:75\n44#4,4:88\n44#4,4:101\n44#4,4:114\n44#4,4:127\n*S KotlinDebug\n*F\n+ 1 ActionComponentExtensions.kt\ncom/adyen/checkout/action/core/internal/provider/ActionComponentExtensionsKt\n*L\n40#1:43,2\n23#1:45,4\n23#1:53,5\n24#1:58,4\n24#1:66,5\n25#1:71,4\n25#1:79,5\n26#1:84,4\n26#1:92,5\n27#1:97,4\n27#1:105,5\n28#1:110,4\n28#1:118,5\n29#1:123,4\n29#1:131,5\n23#1:49,4\n24#1:62,4\n25#1:75,4\n26#1:88,4\n27#1:101,4\n28#1:114,4\n29#1:127,4\n*E\n"})
public final class ActionComponentExtensionsKt {

    @NotNull
    private static final List<ActionComponentProvider<?, ? extends Configuration, ?>> allActionProviders;

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[PHI: r4 r5
      0x004a: PHI (r4v6 'e' java.lang.Throwable) = (r4v5 'e' java.lang.Throwable), (r4v8 'e' java.lang.Throwable) binds: [B:19:0x0048, B:23:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r5v5 com.adyen.checkout.core.AdyenLogLevel) = (r5v4 com.adyen.checkout.core.AdyenLogLevel), (r5v6 com.adyen.checkout.core.AdyenLogLevel) binds: [B:19:0x0048, B:23:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[PHI: r4 r5
      0x007a: PHI (r4v11 'e' java.lang.Throwable) = (r4v10 'e' java.lang.Throwable), (r4v13 'e' java.lang.Throwable) binds: [B:31:0x0078, B:35:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r5v9 com.adyen.checkout.core.AdyenLogLevel) = (r5v8 com.adyen.checkout.core.AdyenLogLevel), (r5v10 com.adyen.checkout.core.AdyenLogLevel) binds: [B:31:0x0078, B:35:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[PHI: r4 r5
      0x00aa: PHI (r4v16 'e' java.lang.Throwable) = (r4v15 'e' java.lang.Throwable), (r4v18 'e' java.lang.Throwable) binds: [B:43:0x00a8, B:47:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r5v13 com.adyen.checkout.core.AdyenLogLevel) = (r5v12 com.adyen.checkout.core.AdyenLogLevel), (r5v14 com.adyen.checkout.core.AdyenLogLevel) binds: [B:43:0x00a8, B:47:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da A[PHI: r4 r5
      0x00da: PHI (r4v21 'e' java.lang.Throwable) = (r4v20 'e' java.lang.Throwable), (r4v23 'e' java.lang.Throwable) binds: [B:55:0x00d8, B:59:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r5v17 com.adyen.checkout.core.AdyenLogLevel) = (r5v16 com.adyen.checkout.core.AdyenLogLevel), (r5v18 com.adyen.checkout.core.AdyenLogLevel) binds: [B:55:0x00d8, B:59:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[PHI: r4 r5
      0x010a: PHI (r4v26 'e' java.lang.Throwable) = (r4v25 'e' java.lang.Throwable), (r4v28 'e' java.lang.Throwable) binds: [B:67:0x0108, B:71:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r5v21 com.adyen.checkout.core.AdyenLogLevel) = (r5v20 com.adyen.checkout.core.AdyenLogLevel), (r5v22 com.adyen.checkout.core.AdyenLogLevel) binds: [B:67:0x0108, B:71:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a A[PHI: r4 r5
      0x013a: PHI (r4v31 'e' java.lang.Throwable) = (r4v30 'e' java.lang.Throwable), (r4v32 'e' java.lang.Throwable) binds: [B:79:0x0138, B:83:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r5v25 com.adyen.checkout.core.AdyenLogLevel) = (r5v24 com.adyen.checkout.core.AdyenLogLevel), (r5v26 com.adyen.checkout.core.AdyenLogLevel) binds: [B:79:0x0138, B:83:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a A[PHI: r4 r5
      0x001a: PHI (r4v1 'e' java.lang.Throwable) = (r4v0 'e' java.lang.Throwable), (r4v3 'e' java.lang.Throwable) binds: [B:7:0x0018, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x001a: PHI (r5v1 com.adyen.checkout.core.AdyenLogLevel) = (r5v0 com.adyen.checkout.core.AdyenLogLevel), (r5v2 com.adyen.checkout.core.AdyenLogLevel) binds: [B:7:0x0018, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.action.core.internal.provider.ActionComponentExtensionsKt.<clinit>():void");
    }

    @Nullable
    public static final ActionComponentProvider<?, ?, ?> getActionProviderFor(@NotNull Action action) {
        Object next;
        action.getClass();
        Iterator<T> it = allActionProviders.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ActionComponentProvider) next).canHandleAction(action)) {
                break;
            }
        }
        return (ActionComponentProvider) next;
    }
}
