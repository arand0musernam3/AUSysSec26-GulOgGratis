package h50;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f21476a;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int i11 = objectInput.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            f fVar = new f();
            fVar.f21448b = null;
            fVar.f21450d = null;
            fVar.f21452f = null;
            fVar.f21456h = null;
            fVar.f21460j = null;
            fVar.l = null;
            fVar.f21463n = null;
            fVar.f21465p = null;
            fVar.f21467r = null;
            fVar.f21469t = null;
            fVar.f21471v = null;
            fVar.f21473x = null;
            fVar.f21475z = null;
            fVar.B = null;
            fVar.D = null;
            fVar.F = null;
            fVar.H = null;
            fVar.I = "";
            fVar.J = 0;
            fVar.K = "";
            fVar.M = "";
            fVar.O = "";
            fVar.Q = "";
            fVar.V = "";
            fVar.X = "";
            fVar.Y = false;
            fVar.Z = new ArrayList();
            fVar.f21457h0 = new ArrayList();
            fVar.t0 = false;
            fVar.f21455g1 = "";
            fVar.f21458h1 = false;
            fVar.readExternal(objectInput);
            this.f21476a.add(fVar);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        ArrayList arrayList = this.f21476a;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            ((f) arrayList.get(i11)).writeExternal(objectOutput);
        }
    }
}
