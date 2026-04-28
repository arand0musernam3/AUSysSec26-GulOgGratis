package com.braze.models;

import com.braze.support.DateTimeUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends p {
    /* JADX WARN: Illegal instructions before constructor call */
    public n() {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        super(new q(uuidRandomUUID), DateTimeUtils.nowInSecondsPrecise(), null, false);
    }

    @Override // com.braze.models.p
    public final Double e() {
        return this.f10213c;
    }

    @Override // com.braze.models.p
    public final String toString() {
        return "\nMutableSession(sessionId=" + f() + ", startTime=" + g() + ", endTime=" + this.f10213c + ", isSealed=" + h() + ", duration=" + d() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, double d3, Double d11, boolean z11) {
        super(qVar, d3, d11, z11);
        qVar.getClass();
    }
}
