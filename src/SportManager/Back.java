package SportManager;

import javax.swing.*;

/**
 * Created by Asus on 10.04.2017.
 */
public class Back extends JFrame {
    public Back() {

        super ("Тренировка спины");

        JTextArea textArea;
        JPanel jback = new JPanel();

        setContentPane(jback);
        setSize(400, 500);
        setVisible(true);
        textArea = new JTextArea(28,30);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        jback.add(scrollPane);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText("Если вы занимаетесь по сплиту, то спину можно тренировать в один день " +
                "с трицепсами, ногами, бицепсами или плечами.\n" +
                "\n Людям, рабочая деятельность которых связана с тяжелым физическим трудом, рекомендуется " +
                "выполнять не более трех-четырех сетов за одну тренировку. Если вы не испытываете " +
                "повседневную нагрузку на спину, то за одну тренировку нужно выполнять 6-8 сетов " +
                "(сумма сетов всех упражнений) на спину.\n" +
                "\n Обычно, достаточно двух-трех упражнений на спину, для достижения хороших результатов. " +
                "Для увеличения рельефа и мышечной массы выполняйте по 10-15 повторений. При занятиях " +
                "для развития силы уменьшите количество повторов до 5-7.\n" +
                "\n Упражнения на мышцы спины являются одними из самых травмоопасных, наиболее часто " +
                "инвалидизация в бодибилдинге связана с позвоночником: остеохондроз, грыжи межпозвоночных " +
                "дисков, спондилолистез, ущемление корешков спинно-мозговых нервов и так далее. Все " +
                "эти заболевания связаны с нерациональным тренингом и чрезмерными нагрузками на позвоночный столб.\n" +
                "\n Если вы недавно приступили к занятиям по бодибилдингу, то на начальных этапах используйте " +
                "небольшие веса, даже если вы чувствуете, что можете поднять гораздо больше. Чтобы " +
                "подвергать спину высоким нагрузкам, предварительно нужно укрепить мышечно-связочный " +
                "аппарат, который будет защищать позвоночник от повреждения.\n" +
                "\n" );
    }

}