package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb f11253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.r1 f11254b;

    public ac(nb nbVar, androidx.recyclerview.widget.r1 r1Var) {
        this.f11253a = nbVar;
        this.f11254b = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        nb nbVar = acVar.f11253a;
        nb nbVar2 = this.f11253a;
        if (nbVar2 == null) {
            if (nbVar != null) {
                return false;
            }
        } else if (!nbVar2.equals(nbVar)) {
            return false;
        }
        return this.f11254b.equals(acVar.f11254b);
    }

    public final int hashCode() {
        nb nbVar = this.f11253a;
        return (((nbVar == null ? 0 : nbVar.hashCode()) ^ 1000003) * 1000003) ^ this.f11254b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11253a);
        String string = this.f11254b.toString();
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        j4.s.A(sb2, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb2.append("}");
        return sb2.toString();
    }
}
