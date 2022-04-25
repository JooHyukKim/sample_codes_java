package pattern.command;

import org.junit.jupiter.api.Test;

public class RemoteLoader {
  @Test
  void test() {
    new RemoteControl().onButtonWasPushed(3);
  }
}

class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;

  public RemoteControl() {
    this.onCommands = new Command[7];
    this.offCommands = new Command[7];
    for (int i = 0; i < 7; i++) {
      int finalI = i;
      onCommands[i] = () -> System.out.println("nothing happens when pressing onButton : " + finalI);
      offCommands[i] = () -> System.out.println("nothing happens when pressing offButton : " + finalI);
    }
  }

  void setCommand(int idx, Command onCmd, Command offCmd) {
    onCommands[idx] = onCmd;
    offCommands[idx] = offCmd;
  }

  void onButtonWasPushed(int idx) {
    onCommands[idx].execute();
  }

  void offButtonWasPushed(int idx) {
    offCommands[idx].execute();
  }
}


interface Command {
  void execute();
}