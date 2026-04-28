package q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f36082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36084c;

    public b0(Context context, c0 c0Var, XmlResourceParser xmlResourceParser) {
        this.f36083b = -1;
        this.f36084c = 17;
        this.f36082a = c0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.v.f2522q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 1) {
                this.f36083b = typedArrayObtainStyledAttributes.getResourceId(index, this.f36083b);
            } else if (index == 0) {
                this.f36084c = typedArrayObtainStyledAttributes.getInt(index, this.f36084c);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(MotionLayout motionLayout, int i11, c0 c0Var) {
        int i12 = this.f36083b;
        View viewFindViewById = motionLayout;
        if (i12 != -1) {
            viewFindViewById = motionLayout.findViewById(i12);
        }
        if (viewFindViewById == null) {
            Log.e("MotionScene", "OnClick could not find id " + i12);
            return;
        }
        int i13 = c0Var.f36089d;
        int i14 = c0Var.f36088c;
        if (i13 == -1) {
            viewFindViewById.setOnClickListener(this);
            return;
        }
        int i15 = this.f36084c;
        int i16 = i15 & 1;
        boolean z11 = false;
        boolean z12 = (i16 != 0 && i11 == i13) | (i16 != 0 && i11 == i13) | ((i15 & 256) != 0 && i11 == i13) | ((i15 & 16) != 0 && i11 == i14);
        if ((i15 & 4096) != 0 && i11 == i14) {
            z11 = true;
        }
        if (z12 || z11) {
            viewFindViewById.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i11 = this.f36083b;
        if (i11 == -1) {
            return;
        }
        View viewFindViewById = motionLayout.findViewById(i11);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i11);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c0 c0Var = this.f36082a;
        d0 d0Var = c0Var.f36095j;
        MotionLayout motionLayout = d0Var.f36117a;
        if (motionLayout.f2276j) {
            if (c0Var.f36089d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.B(c0Var.f36088c);
                    return;
                }
                c0 c0Var2 = new c0(d0Var, c0Var);
                c0Var2.f36089d = currentState;
                c0Var2.f36088c = c0Var.f36088c;
                motionLayout.setTransition(c0Var2);
                motionLayout.A();
                return;
            }
            c0 c0Var3 = d0Var.f36119c;
            int i11 = this.f36084c;
            int i12 = i11 & 1;
            boolean z11 = false;
            boolean z12 = true;
            boolean z13 = (i12 == 0 && (i11 & 256) == 0) ? false : true;
            int i13 = i11 & 16;
            if (i13 == 0 && (i11 & 4096) == 0) {
                z12 = false;
            }
            if (z13 && z12) {
                if (c0Var3 != c0Var) {
                    motionLayout.setTransition(c0Var);
                }
                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                    z12 = false;
                    z11 = z13;
                }
            } else {
                z11 = z13;
            }
            if (c0Var != c0Var3) {
                int i14 = c0Var.f36088c;
                int i15 = c0Var.f36089d;
                int i16 = motionLayout.f2267f;
                if (i15 == -1) {
                    if (i16 == i14) {
                        return;
                    }
                } else if (i16 != i15 && i16 != i14) {
                    return;
                }
            }
            if (z11 && i12 != 0) {
                motionLayout.setTransition(c0Var);
                motionLayout.A();
                return;
            }
            if (z12 && i13 != 0) {
                motionLayout.setTransition(c0Var);
                motionLayout.o(0.0f);
            } else if (z11 && (i11 & 256) != 0) {
                motionLayout.setTransition(c0Var);
                motionLayout.setProgress(1.0f);
            } else {
                if (!z12 || (i11 & 4096) == 0) {
                    return;
                }
                motionLayout.setTransition(c0Var);
                motionLayout.setProgress(0.0f);
            }
        }
    }
}
