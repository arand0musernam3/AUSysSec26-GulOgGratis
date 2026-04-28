package t50;

import ex.i;
import ky.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i11) {
        super(19);
        this.f39819e = i11;
    }

    @Override // ky.p, t50.b
    public void j(c cVar) {
        switch (this.f39819e) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    if (cVar.b()) {
                        char cA = cVar.a();
                        cVar.f39802d++;
                        n(cA, sb2);
                        if (sb2.length() % 3 == 0) {
                            p.u(cVar, sb2);
                            if (i.C(cVar.f39802d, 3, cVar.f39799a) != 3) {
                                cVar.f39803e = 0;
                            }
                        }
                    }
                }
                s(cVar, sb2);
                break;
            default:
                super.j(cVar);
                break;
        }
    }

    @Override // ky.p
    public final int n(char c3, StringBuilder sb2) {
        switch (this.f39819e) {
            case 0:
                if (c3 == ' ') {
                    sb2.append((char) 3);
                    return 1;
                }
                if (c3 >= '0' && c3 <= '9') {
                    sb2.append((char) (c3 - ','));
                    return 1;
                }
                if (c3 >= 'a' && c3 <= 'z') {
                    sb2.append((char) (c3 - 'S'));
                    return 1;
                }
                if (c3 < ' ') {
                    sb2.append((char) 0);
                    sb2.append(c3);
                } else if (c3 >= '!' && c3 <= '/') {
                    sb2.append((char) 1);
                    sb2.append((char) (c3 - '!'));
                } else if (c3 >= ':' && c3 <= '@') {
                    sb2.append((char) 1);
                    sb2.append((char) (c3 - '+'));
                } else if (c3 >= '[' && c3 <= '_') {
                    sb2.append((char) 1);
                    sb2.append((char) (c3 - 'E'));
                } else if (c3 == '`') {
                    sb2.append((char) 2);
                    sb2.append((char) (c3 - '`'));
                } else if (c3 >= 'A' && c3 <= 'Z') {
                    sb2.append((char) 2);
                    sb2.append((char) (c3 - '@'));
                } else {
                    if (c3 < '{' || c3 > 127) {
                        sb2.append("\u0001\u001e");
                        return n((char) (c3 - 128), sb2) + 2;
                    }
                    sb2.append((char) 2);
                    sb2.append((char) (c3 - '`'));
                }
                return 2;
            default:
                if (c3 == '\r') {
                    sb2.append((char) 0);
                } else if (c3 == ' ') {
                    sb2.append((char) 3);
                } else if (c3 == '*') {
                    sb2.append((char) 1);
                } else if (c3 == '>') {
                    sb2.append((char) 2);
                } else if (c3 >= '0' && c3 <= '9') {
                    sb2.append((char) (c3 - ','));
                } else {
                    if (c3 < 'A' || c3 > 'Z') {
                        i.y(c3);
                        throw null;
                    }
                    sb2.append((char) (c3 - '3'));
                }
                return 1;
        }
    }

    @Override // ky.p
    public final int p() {
        switch (this.f39819e) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // ky.p
    public void s(c cVar, StringBuilder sb2) {
        switch (this.f39819e) {
            case 1:
                StringBuilder sb3 = cVar.f39801c;
                cVar.c(sb3.length());
                int length = cVar.f39804f.f39812b - sb3.length();
                cVar.f39802d -= sb2.length();
                String str = cVar.f39799a;
                if ((str.length() - cVar.f39805g) - cVar.f39802d > 1 || length > 1 || (str.length() - cVar.f39805g) - cVar.f39802d != length) {
                    cVar.d((char) 254);
                }
                if (cVar.f39803e < 0) {
                    cVar.f39803e = 0;
                }
                break;
            default:
                super.s(cVar, sb2);
                break;
        }
    }
}
