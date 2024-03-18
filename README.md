# sspringer_mcts_bot
This is a modified variant of the built-in InformedNaiveMCTS bot for MicroRTS
Original source can be found here: [https://github.com/Farama-Foundation/MicroRTS/tree/master/src/ai/mcts/informedmcts](https://github.com/Farama-Foundation/MicroRTS/tree/master/src/ai/mcts/informedmcts)

## Modifications
Modifications include:
- [ ] Use a different AI (not the randombiasedAI) for move choice in expansion
- [ ] Tweak best move selection method
- [ ] move pruning
- [ ] search seeding
- [x] decaying reward
- [ ] simulation weighting
- [ ] (eventually) leaf parallelization.

## Instructions for building this bot
- Clone this repository
- Open the project in VSCode
- Set this folder as its own Java project, and ensure all the sources appear correctly in the src section within the `Java Projects` pane.
- add `jdom.jar`, `minimal-json-0.9.4.jar`, and `MicroRTS.jar` as `Referenced Libraries`.
![image](https://github.com/SilasSpringer/sspringer_mcts_bot/assets/54564568/aa22ff7f-925d-47ab-989d-c1ea24fbbfb8)


### to export to a jar
- click the `export Jar...` button at the top of the `Java Projects` pane
- in the checkbox list it shows, _deselect_ all libraries, leaving _only_ `bin` checked.
![image](https://github.com/SilasSpringer/sspringer_mcts_bot/assets/54564568/2ec70781-2869-4647-a6ce-153d463178e1)

- click `OK`

It should then export the Jar to the top level directory of this repository, overwriting the included jar file.
