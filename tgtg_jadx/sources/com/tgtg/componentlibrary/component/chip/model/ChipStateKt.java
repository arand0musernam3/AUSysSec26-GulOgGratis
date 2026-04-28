package com.tgtg.componentlibrary.component.chip.model;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.m;
import m3.n;
import m3.s;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "isSelected", "isEnabled", "isElevated", "Lcom/tgtg/componentlibrary/component/chip/model/ChipState;", "rememberChipState", "(ZZZLm3/n;I)Lcom/tgtg/componentlibrary/component/chip/model/ChipState;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChipState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChipState.kt\ncom/tgtg/componentlibrary/component/chip/model/ChipStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,26:1\n1128#2,6:27\n*S KotlinDebug\n*F\n+ 1 ChipState.kt\ncom/tgtg/componentlibrary/component/chip/model/ChipStateKt\n*L\n19#1:27,6\n*E\n"})
public final class ChipStateKt {
    @NotNull
    public static final ChipState rememberChipState(boolean z11, boolean z12, boolean z13, @Nullable n nVar, int i11) {
        boolean z14 = ((((i11 & 14) ^ 6) > 4 && ((s) nVar).g(z11)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && ((s) nVar).g(z12)) || (i11 & 48) == 32) | ((((i11 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && ((s) nVar).g(z13)) || (i11 & MLKEMEngine.KyberPolyBytes) == 256);
        s sVar = (s) nVar;
        Object objM = sVar.M();
        if (z14 || objM == m.f29332a) {
            objM = new ChipState(z11, z12, z13);
            sVar.k0(objM);
        }
        return (ChipState) objM;
    }
}
