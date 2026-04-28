package com.adyen.checkout.components.core.internal.data.api;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/api/DefaultPublicKeyRepository;", "Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyRepository;", "Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyService;", "publicKeyService", "<init>", "(Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyService;)V", "T", "", "times", "Lkotlin/Function0;", "block", "retryOnFailure", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/adyen/checkout/core/Environment;", "environment", "", "clientKey", "Lu70/q;", "fetchPublicKey-0E7RQCE", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "fetchPublicKey", "Lcom/adyen/checkout/components/core/internal/data/api/PublicKeyService;", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultPublicKeyRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPublicKeyRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultPublicKeyRepository\n+ 2 ResultExt.kt\ncom/adyen/checkout/core/internal/util/ResultExtKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,53:1\n35#1,12:73\n17#2,2:54\n19#2,4:85\n16#3,17:56\n*S KotlinDebug\n*F\n+ 1 DefaultPublicKeyRepository.kt\ncom/adyen/checkout/components/core/internal/data/api/DefaultPublicKeyRepository\n*L\n28#1:73,12\n25#1:54,2\n25#1:85,4\n26#1:56,17\n*E\n"})
public final class DefaultPublicKeyRepository implements PublicKeyRepository {
    private static final int CONNECTION_RETRIES = 3;

    @NotNull
    private final PublicKeyService publicKeyService;

    public DefaultPublicKeyRepository(@NotNull PublicKeyService publicKeyService) {
        publicKeyService.getClass();
        this.publicKeyService = publicKeyService;
    }

    private final <T> T retryOnFailure(int times, Function0<? extends T> block) throws Throwable {
        Throwable th2 = null;
        for (int i11 = 0; i11 < times; i11++) {
            try {
                return (T) block.invoke();
            } catch (Throwable th3) {
                th2 = th3;
            }
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("throwable");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[Catch: all -> 0x0084, CancellationException -> 0x0086, TryCatch #4 {CancellationException -> 0x0086, all -> 0x0084, blocks: (B:38:0x00b6, B:41:0x00bd, B:42:0x00c2, B:44:0x00c6, B:46:0x00cf, B:45:0x00cc, B:19:0x0047, B:21:0x0057, B:25:0x0076, B:24:0x0070, B:30:0x0088), top: B:54:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ad -> B:37:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ba -> B:41:0x00bd). Please report as a decompilation issue!!! */
    @Override // com.adyen.checkout.components.core.internal.data.api.PublicKeyRepository
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: fetchPublicKey-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo85fetchPublicKey0E7RQCE(@org.jetbrains.annotations.NotNull com.adyen.checkout.core.Environment r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<java.lang.String>> r12) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.data.api.DefaultPublicKeyRepository.mo85fetchPublicKey0E7RQCE(com.adyen.checkout.core.Environment, java.lang.String, x70.c):java.lang.Object");
    }
}
