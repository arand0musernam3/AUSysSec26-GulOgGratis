package fo;

import android.widget.SeekBar;
import com.app.tgtg.feature.orderview.OrderRedeemer;
import no.p;
import pg.y2;
import pg.z2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sa.a f17870c;

    public /* synthetic */ a(Object obj, sa.a aVar, int i11) {
        this.f17868a = i11;
        this.f17869b = obj;
        this.f17870c = aVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
        int i12 = this.f17868a;
        seekBar.getClass();
        switch (i12) {
            case 0:
                ((z2) this.f17870c).f35324d.setAlpha(1.0f - ((i11 / 100) * 2));
                break;
            default:
                ((y2) this.f17870c).f35289i.getBinding().f35324d.setAlpha(1.0f - ((i11 / 100) * 2));
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i11 = this.f17868a;
        seekBar.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i11 = this.f17868a;
        seekBar.getClass();
        switch (i11) {
            case 0:
                if (seekBar.getProgress() <= 95) {
                    ((z2) this.f17870c).f35323c.setProgress(0);
                } else {
                    b redeemListener = ((OrderRedeemer) this.f17869b).getRedeemListener();
                    if (redeemListener != null) {
                        ((p) redeemListener).a();
                    }
                }
                break;
            default:
                if (seekBar.getProgress() <= 95) {
                    oo.a.W(((y2) this.f17870c).f35289i.getBinding().f35323c);
                } else {
                    ((p) ((b) this.f17869b)).a();
                }
                break;
        }
    }
}
