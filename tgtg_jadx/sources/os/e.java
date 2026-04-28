package os;

import a3.y;
import android.widget.SeekBar;
import kotlin.jvm.functions.Function0;
import m3.g1;
import pg.j3;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f33745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3 f33746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f33747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f33748e;

    public /* synthetic */ e(b0 b0Var, j3 j3Var, Object obj, g1 g1Var, int i11) {
        this.f33744a = i11;
        this.f33745b = b0Var;
        this.f33746c = j3Var;
        this.f33748e = obj;
        this.f33747d = g1Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
        int i12 = this.f33744a;
        seekBar.getClass();
        switch (i12) {
            case 0:
                this.f33747d.i(1.0f - ((i11 / 100) * 2));
                break;
            default:
                this.f33747d.i(1.0f - ((i11 / 100) * 2));
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i11 = this.f33744a;
        seekBar.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i11 = this.f33744a;
        seekBar.getClass();
        switch (i11) {
            case 0:
                if (seekBar.getProgress() <= 95) {
                    this.f33746c.f34926b.setProgress(0);
                } else {
                    f0.B(this.f33745b, null, null, new y((Function0) this.f33748e, (x70.c) null, 21), 3);
                }
                break;
            default:
                if (seekBar.getProgress() <= 95) {
                    this.f33746c.f34926b.setProgress(0);
                } else {
                    f0.B(this.f33745b, null, null, new y((t5.a) this.f33748e, (x70.c) null, 24), 3);
                }
                break;
        }
    }
}
