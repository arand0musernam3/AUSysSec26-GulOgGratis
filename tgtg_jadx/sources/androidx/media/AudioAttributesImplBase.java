package androidx.media;

import j4.s;
import java.util.Arrays;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3559d;

    public final boolean equals(Object obj) {
        int i11;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3557b == audioAttributesImplBase.f3557b) {
            int i12 = this.f3558c;
            int i13 = audioAttributesImplBase.f3558c;
            int i14 = audioAttributesImplBase.f3559d;
            if (i14 == -1) {
                int i15 = audioAttributesImplBase.f3556a;
                int i16 = AudioAttributesCompat.f3552b;
                if ((i13 & 1) != 1) {
                    i11 = 4;
                    if ((i13 & 4) != 4) {
                        switch (i15) {
                            case 2:
                                i11 = 0;
                                break;
                            case 3:
                                i11 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i11 = 5;
                                break;
                            case 6:
                                i11 = 2;
                                break;
                            case 11:
                                i11 = 10;
                                break;
                            case 12:
                            default:
                                i11 = 3;
                                break;
                            case 13:
                                i11 = 1;
                                break;
                        }
                    } else {
                        i11 = 6;
                    }
                } else {
                    i11 = 7;
                }
            } else {
                i11 = i14;
            }
            if (i11 == 6) {
                i13 |= 4;
            } else if (i11 == 7) {
                i13 |= 1;
            }
            if (i12 == (i13 & 273) && this.f3556a == audioAttributesImplBase.f3556a && this.f3559d == i14) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3557b), Integer.valueOf(this.f3558c), Integer.valueOf(this.f3556a), Integer.valueOf(this.f3559d)});
    }

    public final String toString() {
        String strF;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f3559d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f3559d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i11 = this.f3556a;
        int i12 = AudioAttributesCompat.f3552b;
        switch (i11) {
            case 0:
                strF = "USAGE_UNKNOWN";
                break;
            case 1:
                strF = "USAGE_MEDIA";
                break;
            case 2:
                strF = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strF = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strF = "USAGE_ALARM";
                break;
            case 5:
                strF = "USAGE_NOTIFICATION";
                break;
            case 6:
                strF = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strF = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strF = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strF = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strF = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strF = "USAGE_GAME";
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            default:
                strF = s.f(i11, "unknown usage ");
                break;
            case 16:
                strF = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strF);
        sb2.append(" content=");
        sb2.append(this.f3557b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f3558c).toUpperCase());
        return sb2.toString();
    }
}
